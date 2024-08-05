package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 100000000000000; 컴파일러는 int로 간주하기 때문에 에러 발생 L이 long 타입임을 컴파일러에 알려줌
		long var4 = 100000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		
		
	}
}
