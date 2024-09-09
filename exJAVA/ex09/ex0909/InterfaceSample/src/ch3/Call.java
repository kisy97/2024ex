package ch3;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator calculator = new AddCalc();

		Calculator calculator = new SubCalc();
		
		Integer result = calculator.calc(10, 5);

		System.out.println("계산 결과는 (" + result + ")입니다.");
	}

}
