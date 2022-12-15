package lt.techin.pvz;

public class UserDBRepository implements UserRepository {

	@Override
	public boolean save(User user) {
		System.out.println("irasau i db");
		return true;
	}

}
