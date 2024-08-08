package my.pkg;

public class PuppyGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy puppy1 = new Puppy("똘이");
		puppy1.type = "포메라니안";
		puppy1.color = "갈색";
		
		System.out.println("강아지 이름: " + puppy1.name);
		System.out.println("강아지 종류: " + puppy1.type);
		System.out.println("강아지 색상: " + puppy1.color);
		System.out.println("------------------------------------");
		
		Puppy puppy2 = new Puppy("초코","요크셔 테리어","검은색");
		
		System.out.println("강아지 이름: " + puppy2.name);
		System.out.println("강아지 종류: " + puppy2.type);
		System.out.println("강아지 색상: " + puppy2.color);
	}

}
