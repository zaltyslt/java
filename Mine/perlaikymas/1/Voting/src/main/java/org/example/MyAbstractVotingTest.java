package org.example;

import lt.vtvpmc.java.voting.AbstractVotingTest;
import lt.vtvpmc.java.voting.VoteRegistry;

public class MyAbstractVotingTest extends AbstractVotingTest {
    @Override
    protected VoteRegistry getVoteRegistry() {
        return new MyVoteRegistry();
    }
}
