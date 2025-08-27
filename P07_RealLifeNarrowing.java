public class P07_RealLifeNarrowing {
    public static void main(String[] args) {
        
        double bankBalance = 500123.546d;   // larger type (double)
        
        // Narrowing: converting double → int
        int atmDisplay = (int)bankBalance;

        System.out.println("Actual bank balance: "+bankBalance);
        System.out.println("ATM displays(after narrowing): "+atmDisplay);
    }
}
