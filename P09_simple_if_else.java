/*
    if(condition){
        block of code to be executed if the condition is true
    }
    else{
        block of code to be executed if the condition is false
    }
 */

public class P09_simple_if_else {
    public static void main(String[] args) {
        
        int marks = 60;
        if(marks >= 75){
            System.out.println("congratulations you are pass.");
        }
        else{
            System.out.println("you are failed, better luck next time.");
        }

    }
}
