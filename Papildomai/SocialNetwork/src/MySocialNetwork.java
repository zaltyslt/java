import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MySocialNetwork implements SocialNetwork {
	Collection<Friend> friends;

	public MySocialNetwork() {
		super();
		this.friends = new ArrayList();
		;
	}

	@Override
	public void addFriend(Friend friend) {
		if (friend != null) {
			if (!friends.contains(friend)) {
				this.friends.add(friend);
			}

		} else {
			throw new IllegalArgumentException();
		}

	}

	@Override
	public Collection<Friend> findByCity(String city) {
		Collection<Friend> sameCity = new ArrayList();

		if (city != null) {

			for (Friend friend : friends) {
				if (friend.getCity().equals(city)) {
					sameCity.add(friend);
				}
			}
		} else {
			throw new IllegalArgumentException();
		}

		if (sameCity.size()>0) {
				return sameCity;
			} else {
				return sameCity;
			
			}
	}

	@Override
	public Friend findFriend(String name, String lastName) throws FriendNotFoundException {
		if (name.equals("") && lastName.equals("")) {
			throw new IllegalArgumentException();
		} else {
			for (Friend friend : friends) {
				if (friend.getFirstName().equals(name) && friend.getLastName().equals(lastName)) {
					return friend;
				}
			}
			throw new FriendNotFoundException(name, lastName);
		}
	}
	
	

	@Override
	public int getNumberOfFriends() {
		return friends.size();
	}

	//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Comparator.html
	public Collection<Friend> getOrderedFriends() {
		List<Friend> orderedFriends = new ArrayList<>(friends);
//		Comparator<Friend> comp = new compareFirends();
	
		return friends.stream().sorted(Comparator.comparing(Friend::getCity)
												 .thenComparing(Friend::getLastName)
			                                     .thenComparing(Friend::getFirstName))
				.toList();
	
	//arba
//		Collections.sort(orderedFriends, new CompareFriends());
//		return orderedFriends;	
		
	
	
	
//		Comparator<Friend> comp3 = (f1, f2) -> f1.getCity().compareTo(f2.getCity());
//		Comparator<Friend> comp4 = Comparator.comparing(Friend::getCity);
		// Comparator.comparing(Friend::getCity).thenComparing(Friend::getLastName).thenComparing(Friend::getFirstName);
		//return friends.stream().sorted((f1, f2) -> f1.getCity().compareTo(f2.getCity())).toList();
		

	}

}
