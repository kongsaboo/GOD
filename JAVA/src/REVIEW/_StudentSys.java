package REVIEW;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.ArrayList;
	
	public class _StudentSys {
		//멤버변수
		private BufferedReader in; 
		private int inputNum; 
		private String name;    
		private String schoolNumber; 
		private Student s; 
		private static final int SHCOOL_NUM_LEN = 10;  
	 
		
		public _StudentSys() {
			in = new BufferedReader(new InputStreamReader(System.in));
			inputNum = 0;
			s = Student.genStuObj();
	 }
	 
		public void setInputNum() throws IOException {
			this.inputNum = Integer.parseInt(in.readLine());
	 }
	 
		public int getInputNum() {
			return this.inputNum;
	 }
	 
		public void setName() throws IOException {
		  this.name = in.readLine();
		 }
		 
		public String getName() {
		  return this.name;
		 }
		public void setSchoolNumber() throws IOException {
		  while(true) {
		   this.schoolNumber = in.readLine();
		   if(this.schoolNumber.length() != SHCOOL_NUM_LEN) {
		    System.out.println("\n* 학번은 " + SHCOOL_NUM_LEN + "자리입니다.");
		    System.out.println("* 다시 입력해 주시기 바랍니다.");
		    System.out.print("학번 : ");
		   } else {
		    break;
		   }
		  }
		 }
		 
		public String getSchoolNumber() {
		  return this.schoolNumber;
		 }
		 
		public static void main(String[] ar) {
		  _StudentSys m = new _StudentSys();
		  while (true) {
		   try {
		    printMenu();
		    m.setInputNum();
		    
		    switch (m.getInputNum()) {
		    case 1:
		     System.out.print("이름 : ");
		     m.setName();
		     System.out.print("학번 : ");
		     m.setSchoolNumber();
		     m.s.addStudent(m.getName(), m.getSchoolNumber());
		     break;
		    case 2:
		     System.out.print("학번 : ");
		     m.setSchoolNumber();
		     m.s.delStudent(m.getSchoolNumber());
		     break;
		    case 3:
		     System.out.print("학번 : ");
		     m.setSchoolNumber();
		     m.s.searchStudent(m.getSchoolNumber());
		     break;
		    case 4:
		     m.s.printStudent();
		     break;
		    case 5 :
		     System.out.println("프로그램을 종료합니다.");
		     System.exit(0);
		     break;
		    default:
		     throw new Exception();
		    }
		   } catch (Exception e) {
		    System.out.println("\n=================");
		    System.out.println("입력이 올바르지 않습니다.");
		    System.out.println("1 ~ 5 사이의 숫자를 입력해 주세요");
		    System.out.println("=================\n");
		   }
		  }
		 }
		 public static void printMenu() {
		  System.out.println("========== 학생 관리 프로그램 ==========");
		  System.out.println("1. 학생 추가");
		  System.out.println("2. 학생 삭제");
		  System.out.println("3. 학생 검색");
		  System.out.println("4. 학생 조회");
		  System.out.println("5. 프로그램 종료");
		  System.out.println("★프로그램 종료시 모든 데이터는 소멸됩니다.");
		  System.out.print("입력 : ");
		 }
		}
	
	
	
	class Student {
	 private ArrayList<String> nameList;
	 private ArrayList<String> schoolNumberList;
	 private static Student sObj;
	 private Student() {
	 }
	 public static Student genStuObj() {
	  if (sObj == null) {
	   sObj = new Student();
	   sObj.nameList = new ArrayList<String>();
	   sObj.schoolNumberList = new ArrayList<String>();
	  }
	  return sObj;
	 }
	 public void addStudent(String name, String schoolNumber) {
	  boolean Flag = true;
	  if(Student.sObj.schoolNumberList.size() != 0) {
	   for(int i = 0; i < Student.sObj.schoolNumberList.size(); ++i) {
	    if(schoolNumber.equals(Student.sObj.schoolNumberList.get(i))) {
	     System.out.println("\n* 이미 등록된 정보 입니다.");
	     System.out.println("* 정보 : " + Student.sObj.schoolNumberList.get(i) + " : " + Student.sObj.nameList.get(i) + "\n");
	     Flag = false;
	    }
	   }
	  }
	  if(Flag) {
	   this.nameList.add(name);
	   this.schoolNumberList.add(schoolNumber);
	  }
	 }
	 public void delStudent(String schoolNumber) {
	  if(Student.sObj.schoolNumberList.size() != 0) {
	   for(int i = 0; i < Student.sObj.schoolNumberList.size(); ++i) {
	    if(schoolNumber.equals(Student.sObj.schoolNumberList.get(i))) {
	     Student.sObj.nameList.remove(i);
	     Student.sObj.schoolNumberList.remove(i);
	    }
	   }
	  } else {
	   System.out.println("\n* 삭제할 학생이 없습니다.\n");
	  }
	 }
	 public void searchStudent(String schoolNumber) {
	  if(Student.sObj.schoolNumberList.size() != 0) {
	   for(int i = 0; i < Student.sObj.schoolNumberList.size(); ++i) {
	    if(schoolNumber.equals(Student.sObj.schoolNumberList.get(i))) {
	     System.out.println("이름 : " + Student.sObj.nameList.get(i));
	     System.out.println("학번 : " + Student.sObj.schoolNumberList.get(i));
	    }
	   }
	  } else {
	   System.out.println("\n* " + schoolNumber + "에 해당하는 학생이 없습니다.\n");
	  }
	 }
	 
	 public void printStudent() {
	  if(Student.sObj.nameList.size() < 1) {
	   System.out.println("\n* 등록된 학생이 없습니다.");
	   System.out.println("* 학생 등록 후 조회하시기 바랍니다.\n");
	  } else {
	   System.out.println("-------------- 학생 목록 --------------");
	   for(int i = 0; i < Student.sObj.nameList.size(); ++i) {
	    System.out.println("* " + (i+1) + "번째 학생 : " + Student.sObj.schoolNumberList.get(i) + " : " + Student.sObj.nameList.get(i));
	   }
	   System.out.println("---------------------------------------");
	   System.out.println();
	  }
	 }
	}

