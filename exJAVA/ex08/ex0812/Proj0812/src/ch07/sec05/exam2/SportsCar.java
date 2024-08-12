package ch07.sec05.exam2;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed += 10;
	}
//	final 메소드는 override 불가능
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
}
