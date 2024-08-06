package ch03.sec05;

public class InfinityAndNaNCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
//		잘못된 코드
		double z = x / y;
		double z2 = x % y;

		System.out.println(z + ":" + z2 );

		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");

		} else {
			System.out.println(z);
		}

	}

}
