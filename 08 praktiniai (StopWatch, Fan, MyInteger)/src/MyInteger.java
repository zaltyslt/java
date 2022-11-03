import java.util.Objects;

public class MyInteger {// ©KS

	private int value;

	public MyInteger(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		
		return value;
		
	}

	public boolean isEven() {
		return isEven(this.value);
	}

	public boolean isOdd() {
		return isOdd(this.value);
	}

	public boolean isPrime() {
		return isPrime(this.value);
	}

	public static boolean isEven(int num) {
		if (num % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int num) {
		if (Math.abs(num) == 2) {
			return true;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0 && num != i) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger myInteger) {
		return isEven(myInteger.getValue());

	}

	public static boolean isOdd(MyInteger myInteger) {
		return isOdd(myInteger.getValue());
	}

	public static boolean isPrime(MyInteger myInteger) {
		return isPrime(myInteger.getValue());
	}

	public boolean equals(int number) {
		if (this.value == number) {
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object myInteger) {
		
		if (Objects.isNull(myInteger)) {
			return false;
		}
		if (this == myInteger) {
			return true;
		}

		if (!(myInteger instanceof MyInteger)) {
			return false;
		}

		MyInteger tempInteger = (MyInteger) myInteger;

		return equals(tempInteger.value);
	}

	public static int parseInt(char[] numChar) {
		String numS = "";
		for (Character ch : numChar) {
			numS += ch;
		}
		return parseInt(numS);
	}

	public static int parseInt(String numS) {
		return Integer.parseInt(numS);
	}

}
