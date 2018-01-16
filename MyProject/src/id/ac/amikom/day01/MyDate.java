package id.ac.amikom.day01;

public class MyDate {
	String x;
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		} else {
			throw new IllegalArgumentException
						("Day harus antara 1 - 31");
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		} else {
			throw new IllegalArgumentException
						("Month harus antara 1 - 12");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
