
public class SimpleDate {

	private int day;
	private int month;
	private int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//©KS
	public void advance() {
		this.day++;

		if (this.day > 30) {
			this.day = 1;
			this.month++;
		}
		if (this.month > 12) {
			this.month -= 12;
			this.year++;
		}

	}

	public void advance(int howManyDays) {
		int yearsUp = howManyDays / 360;
		int monthUp = howManyDays / 30 - yearsUp * 12;
		int daysUp = howManyDays - yearsUp * 360 - monthUp * 30;

		this.year += yearsUp;
		this.month += monthUp;
		this.day += daysUp;

		if (this.day > 30) {
			this.day = this.day - 30;
			this.month++;
		}

		if (this.month > 12) {
			this.month -= 12;
			this.year++;
		}

	}

	public SimpleDate afterNumberOfDays(int days) {
		SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
		newDate.advance(days);
		
		return newDate;
	}
	
	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean before(SimpleDate compared) {
		if (this.year < compared.year) {
			return true;
		}

		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

}
