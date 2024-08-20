package my.pkg.interf2;

public class Mypet2 implements SecondInter{
	String name;
	String model;
	String color;
	
	Mypet2() {
		// TODO Auto-generated constructor stub
	}
	Mypet2(String name,String model,String color) {
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
