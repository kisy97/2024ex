package my.pkg.abstraction;

public class PetEx {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("뽀삐");
		dog1.setColor("갈색");
		dog1.setModel("치와와");
		dog1.status();
		dog1.sound();
		
		Cat cat = new Cat();
		cat.setColor("하얀색");
		cat.setName("캔디");
		cat.setModel("페르시안");
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
