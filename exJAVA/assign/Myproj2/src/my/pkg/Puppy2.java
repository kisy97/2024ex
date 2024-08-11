package my.pkg;

public class Puppy2 {
	String name;
	String model;
	String color;
	
	
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


	Puppy2(String model) {
		this.model = model;
	}
	Puppy2(String model,String color) {
		this.model = model;
		this.color = color;
	}
}
