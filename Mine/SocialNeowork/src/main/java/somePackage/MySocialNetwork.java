package somePackage;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;

public class MySocialNetwork implements SocialNetwork {
    List<Friend> friends = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
    if (friend != null){
        if(!this.friends.contains(friend)) {
            this.friends.add(friend);
        }
        else{
            throw new IllegalArgumentException("Adding existing friend");
        }
    }else{throw new IllegalArgumentException("Adding friend null");}
    }

    @Override
    public int getNumberOfFriends() {
        return this.friends.size();
    }

    @Override
    public Friend findFriend(String fName, String lName) throws FriendNotFoundException {
       if(fName!= null && lName!=null){
        return friends.stream()
                .filter(friend -> (fName.equals(friend.getFirstName())) && lName.equals(friend.getLastName()))
                .findAny()
                .orElseThrow(()->new FriendNotFoundException(fName,lName));}
       throw new IllegalArgumentException();
    }

    @Override
    public Collection<Friend> findByCity(String city) {
//       List<Friend> foundFriends = new ArrayList<>();
        if(city!=null){
           return friends.stream().filter(friend -> friend.getCity().equals(city)).toList();
       }
        else{
           throw new IllegalArgumentException("City is null!");
       }

    }

    @Override
    public Collection<Friend> getOrderedFriends() {
        List<Friend> orderedFriends = new ArrayList<>();
        if(friends!=null && friends.size()!=0){
            orderedFriends = new ArrayList<>(friends.stream()
                    .sorted(Comparator.comparing(Friend::getCity)
                    .thenComparing(Friend::getLastName)
                    .thenComparing(Friend::getFirstName)).toList());
        }
        return orderedFriends;
    }
}
