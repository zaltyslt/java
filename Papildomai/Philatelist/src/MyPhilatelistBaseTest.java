import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class MyPhilatelistBaseTest extends PhilatelistBaseTest {//©KS

	public MyPhilatelistBaseTest() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Philatelist getPhilatelist() {
		// TODO Auto-generated method stub
		return new MyPhilatelist();
	}

}
