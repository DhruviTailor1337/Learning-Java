import java.util.Scanner;

public class P03_input2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double width = 0;
        double area = 0;

        System.out.print("Enter height of rectangle:");
        height = scanner.nextDouble();

        System.out.print("Enter width of rectangle:");
        width = scanner.nextDouble();

        area = height * width;

        System.out.println("your area of rectangle is:" + area);
        scanner.close();
    }
}
