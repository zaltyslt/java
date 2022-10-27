
public class Acc {
private int accNo = 0;

public Acc() {
	do  {
		accNo = (int) ((Math.random() * (10 - 0)) + 0);
	}
	while(!Saskaitos.canCreate(accNo));
		
	}
public int getAccNo() {
	return accNo;
}

}

