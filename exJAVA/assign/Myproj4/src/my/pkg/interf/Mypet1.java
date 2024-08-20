package my.pkg.interf;

public class Mypet1 implements FirstInter,SecondInter{
	String name;
	String model;
	String color;
	
	Mypet1() {
		// TODO Auto-generated constructor stub
	}
	Mypet1(String name,String model,String color) {
		this.name= name;
		this.model = model;
		this.color = color;
	}
	
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.print("동물 울음소리: ");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("이름: " + this.name);
		System.out.println("종류: " + this.model);
		System.out.println("색상: " + this.color);
	}
}
