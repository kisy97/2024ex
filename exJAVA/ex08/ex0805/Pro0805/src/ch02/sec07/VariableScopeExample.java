package ch02.sec07;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0;
		if (v1>10) {
			v2 = v1 - 10;
					
		}
		int v3 = v1 + v2 + 5;
		
		System.out.println("v3: " + v3);
	}

}
