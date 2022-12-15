package lt.techin.pvz;

import java.util.ArrayList;

public class UserRepositoryImpl implements UserRepository {

	ArrayList<User> users = new ArrayList<>();

	public boolean save(User user) {
		System.out.println("irasau i arraylist");
		return users.add(user);
	}

}
