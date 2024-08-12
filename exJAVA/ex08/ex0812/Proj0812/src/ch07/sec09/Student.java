package ch07.sec09;

public class Student extends Person{
	public int studentNo;
	
	public Student(String name, int studentNo) {
		// TODO Auto-generated constructor stub
		super(name);
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
