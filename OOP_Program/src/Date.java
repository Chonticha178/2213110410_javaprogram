public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	// Default Constructor
	// Postcondition : dMonht1;dDay=1;dYear=;
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}

	public Date(int month, int day, int year) {
		setDate(month, day, year);
	}

	// Method to set the date
	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	public int getMonth() {
		return dMonth;
	}

	public int getDay() {
		return dDay;
	}

	public int getYear() {
		return dYear;
	}
	
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
}
