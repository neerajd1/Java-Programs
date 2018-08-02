package session3;

public class Student {

	int studentId;
	float marks1,marks2,marks3;
	String studentName;
	
	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public float getMarks1() {
		return marks1;
	}


	public void setMarks1(float marks1) {
		this.marks1 = marks1;
	}


	public float getMarks2() {
		return marks2;
	}


	public void setMarks2(float marks2) {
		this.marks2 = marks2;
	}


	public float getMarks3() {
		return marks3;
	}


	public void setMarks3(float marks3) {
		this.marks3 = marks3;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String name) {
		this.studentName = name;
	}


	double gradation() {
		
		return((marks1+marks2+marks3)/3);
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + studentName  + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3
				+ ", name=" + studentName +", Average = "+this.gradation()+ "]";
	}
	
	
}
