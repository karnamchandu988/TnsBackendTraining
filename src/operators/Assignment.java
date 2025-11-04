// Practice for Assignment Operators


package operators;

public class Assignment {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println("Simple Assignment(=): x = "+x+"\n");
        
        x += y; // x = x + y
        System.out.println("Addition Assignment(+=): x = "+x);
        System.out.println();
        x -= y; // x = x - y
        System.out.println("Subtraction Assignment(-=): x = "+x);
        System.out.println();
        x *= y; // x = x * y
        System.out.println("Multiplication Assignment(*=): x = "+x);
        System.out.println();
        x /= y; // x = x / y
        System.out.println("Division Assignment(/=): x = "+x);
        System.out.println();
        x %= y; // x = x % y
        System.out.println("Modulus Assignment(%=): x = "+x);
    }
}
