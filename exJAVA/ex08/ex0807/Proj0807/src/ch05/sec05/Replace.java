package ch05.sec05;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldString = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newString = oldString.replace("자바", "JAVA");
		
		System.out.println(oldString);
		System.out.println(newString);

	}

}
