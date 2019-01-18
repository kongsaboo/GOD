package ch05;

public class _10_School {

	private String SchoolName;
	private String StudentNumber;
	private String name;
	private int grade;

	public _10_School() {

	}

	public _10_School(String SchoolName, String StudentNumber, String name, int grade) {
		this.SchoolName = SchoolName;
		this.StudentNumber = StudentNumber;
		this.name = name;
		this.grade = grade;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// 매개변수에 다형성 적용
	/*
	 * instanceof 연산잔 : 객체가 지정된 타입(클래스)인지를 검사할 때 사용
	 * 형식 : if(객체 instanceof type)
	 */
	public void getTest(Object school) { // (_10_School school)=(Object school)

		if (school instanceof _10_Middleschool) {// if (_10_Middleschool.class.isInstance(school))

			System.out.println("중학교 성적구하기");

		} else { if (school instanceof _10_College) {
			
				System.out.println("대학교 성적구하기");
				
			} else {
				System.out.println("기타");
			}
		}

	}

	@Override
	public String toString() {
		return "[SchoolName=" + getSchoolName() + ", StudentNumber=" + getStudentNumber() + ", name=" + getName()
				+ ", grade=" + getGrade() + "]";
	}

}
