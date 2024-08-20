package my.pkg.interf2;

public class Dog extends Mypet2{
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String model, String color) {
		super(name, model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		System.out.println("멍 멍");
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("----------------------");
		System.out.println("강아지 정보");
		System.out.println("-----------------------");
		super.status();
	}
	
}
