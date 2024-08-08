package my.pkg;

public class Puppy {
	String name;
	String type;
	String color;

	Puppy() {}
	Puppy(String name ) {
		this.name = name;
	}
	Puppy(String name,String type) {
		this.name = name;
		this.type = type;
	}
	Puppy(String name,String type,String color) {
		this.name = name;
		this.type = type;
		this.color = color;
	}
}
