package lt.techin.pvz;

public class UserServiceImpl implements UserService {

	UserRepository repo;

	public UserServiceImpl(UserRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public User createUser(String name) {

		User user = new User(name);
		boolean created = repo.save(user);
		if (!created) {
			throw new UserServiceException("nepavyko sukurti");
		}
		return user;
	}

}
