package ch11.sec05;

public class Throw {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("예외 처리: " + e.toString());
		}
	}

	public static void findClass() throws ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("java.lang.String2");
	}
	
	
}
