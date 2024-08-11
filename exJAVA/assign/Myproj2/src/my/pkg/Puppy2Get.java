package my.pkg;

public class Puppy2Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy2 puppy = new Puppy2("아프간하운드");
		puppy.setName("똘이");
		puppy.setColor("회색");


		System.out.println("이름 : " + puppy.getName());
		System.out.println("종류 : " + puppy.getModel());
		System.out.println("색상 : " + puppy.getColor());
		System.out.println();
		
		Puppy2 puppy2 = new Puppy2("진돗개","하얀색");
		puppy2.setName("초코");
		
		System.out.println("이름 : " + puppy2.getName());
		System.out.println("종류 : " + puppy2.getModel());
		System.out.println("색상 : " + puppy2.getColor());
		
	}

}
