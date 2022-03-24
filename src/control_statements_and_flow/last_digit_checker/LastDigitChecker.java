package control_statements_and_flow.last_digit_checker;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (isValid(first) && isValid(second) && isValid(third)) {
            String [] digitsInFirst = String.valueOf(first).split("");
            int secondLastDigit = second % 10;
            int thirdLastDigit = third % 10;
            boolean hasSharedDigit = false;
            for (String digit : digitsInFirst) {
                int parsedDigit = Integer.parseInt(digit);
                if (parsedDigit == secondLastDigit || parsedDigit == thirdLastDigit) {
                    hasSharedDigit = true;
                }
            }
            return hasSharedDigit;
        }
        return false;
    }

    public static boolean isValid(int numToCheck) {
        return numToCheck >= 10 && numToCheck <= 1000;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22, 23, 24));
    }
}
