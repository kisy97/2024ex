package ch03.sec09;

public class BitShift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 772;
		byte byte1 = (byte) (val >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫 번쨰 바이트 부호 없는 값" + int1);
		
		byte byte2 = (byte) (val >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번쨰 바이트 부호 없는 값: " + int2);
		
		byte byte3 = (byte) (val >>> 8);
		int int3 = byte3 & 255;
		System.out.println("두 번쨰 바이트 부호 없는 값: " + int3);
		
		byte byte4 = (byte) val;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("두 번쨰 바이트 부호 없는 값: " + int4);
		
		
	}

}
