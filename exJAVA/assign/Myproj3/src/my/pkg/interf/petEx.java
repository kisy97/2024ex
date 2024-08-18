package my.pkg.interf;

public class petEx {
	public static void main(String[] args) {
		Dog dog = new Dog("뽀삐","갈색","치와와");
		dog.status();
		dog.sound();
		
		Cat cat = new Cat("캔디","페르시안","하얀색");
		cat.status();
		cat.sound();
		
		Bird bird = new Bird("창식", "앵무새", "초록색");
		bird.status();
		bird.sound();
		
		Snake snake = new Snake("비실이","방울뱀","노란색");
		snake.status();
		snake.sound();
	}
}
