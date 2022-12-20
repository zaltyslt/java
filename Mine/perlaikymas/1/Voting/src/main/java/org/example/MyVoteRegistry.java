package org.example;

import lt.vtvpmc.java.voting.Vote;
import lt.vtvpmc.java.voting.VoteRegistry;

import java.util.*;

public class MyVoteRegistry implements VoteRegistry {
    private Map<String, Integer> votesRegistry;
    private List<String> voters;
    private boolean votingStoped;


    public MyVoteRegistry() {
        votesRegistry = new HashMap<>();
        votingStoped = false;
        voters = new ArrayList<>();
    }

    @Override
    public boolean registerVote(Vote vote) {
        if (!votingStoped) {
            if (!voters.contains(vote.getVoterId())) {
                if (votesRegistry.containsKey(vote.getVoteCastFor())) {
                    votesRegistry.put(vote.getVoteCastFor(), votesRegistry.get(vote.getVoteCastFor()) + 1);
                } else {
                    votesRegistry.put(vote.getVoteCastFor(), 1);
                }

                voters.add(vote.getVoterId());
                return true;
            }
        }
        return false;
    }

    @Override
    public String getAWinner() {

        if (votesRegistry.size() == 0) {
            throw new IllegalStateException("Nobody voted!");
        }

        Set<String> candidates = votesRegistry.keySet();
        int maxVotes = 0;
        String winner = "";
        for (String candidate : candidates) {
            if (votesRegistry.get(candidate) > maxVotes) {
                winner = candidate;
                maxVotes = votesRegistry.get(candidate);
            }
        }
        Collection<Integer> tempVotes = votesRegistry.values();
        if(Collections.frequency(tempVotes, maxVotes) > 1 ){
            throw new IllegalStateException();
        }

        return winner;
    }

    @Override
    public int getNumberOfVotesCast() {
        return voters.size();
    }

    @Override
    public void stopVotingProcess() {
        votingStoped = true;
    }
}
