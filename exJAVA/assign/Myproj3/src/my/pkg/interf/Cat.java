package my.pkg.interf;

public class Cat extends Pet{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String model, String color) {
		super(name, model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("고양이 정보");
		super.status();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		System.out.println("야 옹");
	}
	
}
