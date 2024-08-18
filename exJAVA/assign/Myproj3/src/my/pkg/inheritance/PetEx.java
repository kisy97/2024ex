package my.pkg.inheritance;

public class PetEx {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("뽀삐");
		dog1.setColor("갈색");
		dog1.setModel("치와와");
		dog1.status();
		
		Cat cat = new Cat();
		cat.setColor("하얀색");
		cat.setName("캔디");
		cat.setModel("페르시안");
		cat.status();
		
		Bird bird = new Bird("창식", "앵무새", "초록색");
		bird.status();
		
		Snake snake = new Snake("비실이","방울뱀","노란색");
		snake.status();
	}
}
