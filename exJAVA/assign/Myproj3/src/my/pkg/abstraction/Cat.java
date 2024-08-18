package my.pkg.abstraction;

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
		System.out.println("고양이 정보");
		super.status();
	}

	public void sound() {
		System.out.println("야옹");
	}
}
