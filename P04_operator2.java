//Arithmatic oprator using user input
import java.util.Scanner;
public class P04_operator2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        float a = sc.nextFloat();

        System.out.println("Enter 2nd number: ");
        float b = sc.nextFloat();

        System.out.println("Addition of "+a+ " and "+ b +" is: " +(a+b));
        System.out.println("Subtraction of "+a+ " and "+ b +" is: " +(a-b));
        System.out.println("Multiplication of "+a+ " and "+ b +" is: " +(a*b));
        System.out.println("Division of "+a+ " and "+ b +" is: " +(a/b));


        sc.close();
    }
}
