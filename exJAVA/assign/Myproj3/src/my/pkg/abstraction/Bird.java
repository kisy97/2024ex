package my.pkg.abstraction;

public class Bird extends Pet{
	public Bird() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, String model, String color) {
		super(name, model, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("새 정보");
		super.status();
	}

	public void sound() {
		System.out.println("짹짹");
	}
}
