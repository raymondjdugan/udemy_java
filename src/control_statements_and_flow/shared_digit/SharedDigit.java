package control_statements_and_flow.shared_digit;

public class SharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number2 >=10) && (number1 <= 99 && number2 <= 99)) {
            String [] digitsInNumber1 = String.valueOf(number1).split("");
            for (String digit : digitsInNumber1) {
                if (String.valueOf(number2).contains(digit)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(9, 99));
    }
}
