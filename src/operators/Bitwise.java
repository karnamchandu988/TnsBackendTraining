// Practice for bitwise operators

package operators;

public class Bitwise {

	public static void main(String[] args) {

		int a = 5;   // 0101 in binary
		int b = 3;   // 0011 in binary
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
		System.out.println();
		System.out.println("Bitwise AND (a&b) = "+(a & b));
		System.out.println();
		System.out.println("Bitwise OR (a|b) = "+(a | b));
		System.out.println();
		System.out.println("Bitwise XOR (a^b) = "+(a ^ b));
		System.out.println();
		System.out.println("Bitwise Complement(~a) = "+(~a));
		System.out.println();
		System.out.println("Left Shift (a<<1) = "+(a << 1));
		System.out.println();
		System.out.println("Right Shift (a>>1) = "+(a >> 1));
		System.out.println();
		System.out.println("Unsigned Right Shift (a>>>1) = "+(a >>> 1));
		
	}

}
