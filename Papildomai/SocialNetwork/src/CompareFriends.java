import java.util.Comparator;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;

public class CompareFriends implements Comparator<Friend> {

	@Override
	public int compare(Friend friend1, Friend friend2) {

		if (friend1.getCity().compareTo(friend2.getCity()) == 0) {
			if (friend1.getLastName().compareTo(friend2.getLastName()) == 0) {
				if (friend1.getFirstName().compareTo(friend2.getFirstName()) == 0) {
					return 0;

				} else {
					return friend1.getFirstName().compareTo(friend2.getFirstName());
				}
			} else {
				return friend1.getLastName().compareTo(friend2.getLastName());
			}
		} else {
			return friend1.getCity().compareTo(friend2.getCity());
		}

	}
}