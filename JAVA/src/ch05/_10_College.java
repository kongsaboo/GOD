package ch05;

public class _10_College extends _10_School{

	private char gpa;
	
	public _10_College() {
		
		
	}
	public _10_College(String SchoolName , String StudentNumber, String name, int grade, char gpa) {
		super(SchoolName, StudentNumber, name, grade);
		this.gpa = gpa;
	}
	public char getGpa() {
		return gpa;
	}
	public void setGpa(char gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "[SchoolName=" + getSchoolName() + ", StudentNumber=" + getStudentNumber() + ", name=" + getName()
				+ ", grade=" + getGrade() +", 학점 : " +getGpa()+ "]";
	}
}
