package my.pkg.interf;

public class Dog extends Pet {

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String model, String color) {
		super(name, model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("강아지 정보");
		super.status();

	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		System.out.println("멍 멍");
	}

}
