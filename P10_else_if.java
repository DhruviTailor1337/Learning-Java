/*if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}   
*/
public class P10_else_if {
    public static void main(String[] args) {

        int num = 13;
        if (num == 13) {
            System.out.println("number is eqal");
        } else if (num > 13) {
            System.out.println("number is greater");
        } else {
            System.out.println("number is lower");
        }
    }
}
