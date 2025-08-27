import java.util.Scanner;
public class P07_widening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value in string:");
        int a = sc.nextInt();

        float b = a;

        System.out.println("widening of your number is: "+b);
        sc.close();
    }
}
