package method_challenges.equality_printer;

public class EqualityPrinter {
    public static void printEqual(int one, int two, int three) {
        if (one < 0 || two < 0 || three < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (one == three && two == three) {
            System.out.println("All numbers are equal");
        } else if (one == three || one == two || two == three) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test One:");
        printEqual(1, 1, 1);// should print text All numbers are equal
        System.out.println("Test Two:");
        printEqual(1, 1, 2); //should print text Neither all are equal or different
        System.out.println("Test Tree:");
        printEqual(-1, -1, -1); //should print text Invalid Value
        System.out.println("Test Four:");
        printEqual(1, 2, 3);
    }
}
