package ch05;

public class _10_Middleschool extends _10_School {

	private int score ;
	
	public _10_Middleschool() {
		
	}
	public _10_Middleschool(String SchoolName , String StudentNumber, String name, int grade, int score){
		super(SchoolName, StudentNumber, name, grade); //부모클래스의 매개변수 생성자를 가져온다.
		this.score = score;
		
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
		
	}
	
	
	@Override
	public String toString() {
		return "[SchoolName=" + getSchoolName() + ", StudentNumber=" + getStudentNumber() + ", name=" + getName()
				+ ", grade=" + getGrade() +", 점수 : " +getScore()+ "]";
	}
}
