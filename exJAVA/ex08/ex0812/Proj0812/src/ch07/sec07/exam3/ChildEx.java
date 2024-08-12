package ch07.sec07.exam3;

public class ChildEx {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		

		/*		
 		불가능
		parent.field2 = "Data2";
		parent.method3();
 		*/
		Child child = (Child) parent;
		
		child.field2 = "Data2";
		child.method3();
	}
	
}
