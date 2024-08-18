package my.pkg.inheritance;

public class Dog extends Pet{
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
		System.out.println("강아지 정보");
		super.status();
	}
}	
