import java.util.ArrayList;

public class AccountNo {
	private String prefix;
	private int seg1, seg2, seg3, seg4, seg5;
    static ArrayList<String> noList = new ArrayList<>();
	



	public AccountNo() {
		boolean exists = true;

		while (exists) {
			this.prefix = "LT";
			this.seg2 = 10100;
			this.seg3 = (int) ((Math.random() * (9999 - 999)) + 1000);
			this.seg4 = (int) ((Math.random() * (9999 - 999)) + 1000);
			this.seg5 = (int) ((Math.random() * (999 - 99)) + 100);

			this.seg1 = normalizeCount(seg2, seg3, seg4, seg5);
			
			if (!wasThere()) {
				exists = false;
			}
		}
		
		System.out.println(noList);
		
		
	}

	private boolean wasThere() {
//		if (!noList.contains(this.)) {
//			noList.add(this);
//			return false;
//		}
		return true;

	}

	private int normalizeCount(int a, int b, int c, int d) {
		int ac = count(a);
		int bc = count(b);
		int cc = count(c);
		int dc = count(d);

		int sum = ac + bc + cc + dc;

		while (sum > 100) {
			sum = count(sum);
		}

		if (sum < 10) {
			sum += 10;
		}

		return sum;
	}

	private int count(int num) {
		int no = 0;
		if (num < 10) {
			return num;
		} else {
			no += num % 10 + count(num / 10);
		}

		if (no > 10) {
			count(no);
		}
		return no;
	}

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @return the seg1
	 */
	public int getSeg1() {
		return seg1;
	}

	/**
	 * @return the seg2
	 */
	public int getSeg2() {
		return seg2;
	}

	/**
	 * @return the seg3
	 */
	public int getSeg3() {
		return seg3;
	}

	/**
	 * @return the seg4
	 */
	public int getSeg4() {
		return seg4;
	}

	/**
	 * @return the seg5
	 */
	public int getSeg5() {
		return seg5;
	}

	@Override
	public boolean equals(Object accountNo) {
		if (this == accountNo) {
			return true;
		}
		if (accountNo == null) {
			return false;
		}
		if (getClass() != accountNo.getClass()) {
			return false;
		}
		final AccountNo accNo = (AccountNo) accountNo;
		if (this.prefix == accNo.prefix && this.seg1 == accNo.seg1 && this.seg2 == accNo.seg2 && this.seg3 == accNo.seg3
				&& this.seg4 == accNo.seg4 && this.seg5 == accNo.seg5) {
			return true;
		}

		return true;

	}

	@Override
	public String toString() {
		String row = this.prefix + this.seg1 + " " + this.seg2 + " " + this.seg3 + " " + this.seg4 + " " + this.seg5;
		return row;
	}

//LT60 1010 0123 4567 8901
//
//More: https://www.lb.lt/en/iban-and-financial-institution-codes
//LT Two letters – country code 
//60 Two digits – check digits allowing programme control of 
//the account number and ensuring protection for situations 
//where the account number is entered incorrectly 
//10100 Five digits – bank (financial institution) 
//code 12345678901 Eleven digits – account number

}
