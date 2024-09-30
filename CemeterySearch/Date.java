package kim.dami.fishStreet;

public class Date implements Comparable<Date>{
	private int day;
	private int month;
	private int year;
	
	public Date(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	public int compareTo(Date otherDate) {
		if (this.year < otherDate.year) {
			return -1;
		}
		if (this.year > otherDate.year) {
			return 1;
		}
		if (this.month < otherDate.month) {
			return -1;
		}
		if (this.month > otherDate.month) {
			return 1;
		}
		if (this.day < otherDate.day) {
			return -1;
		}
		if (this.day > otherDate.day) {
			return 1;
		}
		return 0;
	}
	
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (obj != null && obj instanceof Date) {
			Date otherDate = (Date) obj;
			if (this.day == otherDate.day && this.month == otherDate.month && this.year == otherDate.year) {
				isEqual = true;
			}
		}
		return isEqual;
	}
}
