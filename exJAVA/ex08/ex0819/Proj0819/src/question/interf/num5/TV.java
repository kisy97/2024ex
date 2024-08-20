package question.interf.num5;

public class TV implements Remocon{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켰습니다.");
	}
	
	public static void main() {
		Remocon r = new TV();
		r.powerOn();
	}
	
}
