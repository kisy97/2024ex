package my.pkg.interf;

public class Pet implements PetInterface {
	String name;
	String model;
	String color;

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public Pet(String name, String model, String color) {
		this.name = name;
		this.color = color;
		this.model = model;
	}

	@Override
	public void status() {
		// TODO Auto-generated method stub
		System.out.println("--------------------------");
		System.out.println("이름: " + this.name);
		System.out.println("모델: " + this.model);
		System.out.println("색상: " + this.color);
		System.out.println("--------------------------");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.print("동물이 울음소리를 냅니다: ");
	}

}
