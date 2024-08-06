package ch03.sec07;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = '8';
		
		if (65<=charCode & charCode<=90) {
			System.out.println("대문자입니다.");
		}
		
		if (97<=charCode && charCode<=122) {
			System.out.println("소문자입니다.");
		}
		
		if (48<=charCode && charCode <=57) {
			System.out.println("0~9 숫자입니다.");

		}
		
		int val = 6;
		
		if (val % 2 == 0 | val % 3 == 0) {
			System.out.println("2 또는 3의 배수입니다.");
		}
	}

}
