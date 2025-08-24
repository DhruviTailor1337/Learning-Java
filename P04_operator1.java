//unary operator that means it requires only 1 operand.
public class P04_operator1 {
    public static void main(String[] args) {
        
        int x = 10;
        //post increment
        System.out.println("value of x before post increment :"+x);
        System.out.println(x++);
        System.out.println("value of x after post increment :"+x);
        System.out.println("\n");

        //pre increment
        System.out.println("value of x before pre increment:"+x);
        System.out.println(++x);
        System.out.println("value of x after pre increment:"+x);
        System.out.println("\n");

        //post decrement
        System.out.println("value of x:"+x);
        System.out.println(x--);
        System.out.println("value of x after pre decrement:"+x);
        System.out.println("\n");

        System.out.println("value of x:"+x);
        System.out.println(--x);
        System.out.println("value of x after post decrement:"+x);
    }
}
