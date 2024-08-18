package my.pkg.abstraction;

public abstract class Pet {
	String name;
	String model;
	String color;
	
	Pet() {
		// TODO Auto-generated constructor stub
	}
	
	Pet(String name, String model, String color) {
		this.name = name;
		this.model = model;
		this.color = color;
		
	}
	
	public void status() {
		System.out.println("이름 : " + this.getName());
		System.out.println("품종 : " + this.getModel());
		System.out.println("색상 : "  + this.getColor());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public abstract void sound();
}
