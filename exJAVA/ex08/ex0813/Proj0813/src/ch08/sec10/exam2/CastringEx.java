package ch08.sec10.exam2;

public class CastringEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}
}
