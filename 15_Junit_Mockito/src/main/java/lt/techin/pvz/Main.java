package lt.techin.pvz;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl(new UserDBRepository());
//		UserService userService = new UserServiceImpl(new UserRepositoryImpl());
		userService.createUser("Jonas");

	}

}
