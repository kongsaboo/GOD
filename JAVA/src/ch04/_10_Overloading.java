package ch04;

public class _10_Overloading {

	/*
	 * 오버로딩 :같은 클래스 안에 같은 이름의 메소드를 여러개 만들기 위해
	 */
	private int year;
	private String month;
	private int day;

	public _10_Overloading() {
		this(1900, "1월", 1);

	}

	public _10_Overloading(int year) {
		this(year, "1월", 1);
	}

	public _10_Overloading(int year, String month, int day) {
		this.month = month;
		this.year = year;
		this.day = day;

	}

	// Override
	public String toString() {
		return " [year =" + year + ", month =" + month + ", day=" + day + "]";
	}

}
