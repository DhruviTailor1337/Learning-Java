import java.util.Scanner;
public class P07_RealLifeWidening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter quantity coffee you would like to have: ");
        int qty = sc.nextInt();

        float price = 70.10f;

        float total_price = qty*price;

        System.out.println("your totle bill of coffee is: "+total_price);
        sc.close();
    }
}
