package ch04;

public class _09_sungjuk {

	// 멤버변수
	private int kor;
	private int eng;
	private int math;

	// 기본생성자
	public _09_sungjuk() {
		System.out.println("===기본생성자=====");
		System.out.println();
	}

	// 매개변수 생성자
	public _09_sungjuk(int kor, int eng, int math) {
		System.out.println("===매개생성자====");
		System.out.println();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// 멤버메소드
	public void setKor(int kor) {
		this.kor = kor;

	}

	public void setMath(int math) {
		this.math = math;

	}

	public void setEng(int eng) {
		this.eng = eng;

	}

	public int getKor() {
		return kor;

	}

	public int getMath() {
		return math;

	}

	public int getEng() {
		return eng;
	}

	// 총점구하기 add();
	public int getTotal() {
		return getKor() + getEng() + getMath();
	}

	// 평균 구하기
	public double getAvg() {
		return (getTotal() / 3);

	}

	// 학점구하기
	public char getGrade() {

		char grade = ' ';

		switch ((int) getAvg() / 10) {

		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		return grade;
	}

	public void getInfo() {
		System.out.println("국어 : " + getKor() + "\n영어 : " + getEng() + "\n수학 : " + getMath() + "\n총점 : " + getTotal()
				 + "\n학점 :" + getGrade());
		System.out.printf("평균 : %.2f", getAvg());
	}
}
