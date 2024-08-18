package my.pkg.abstraction;

public class Snake extends Pet{
	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, String model, String color) {
		super(name, model, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("뱀 정보");
		super.status();
	}
	
	public void sound() {
		System.out.println("쉭 쉭");
	}
}
