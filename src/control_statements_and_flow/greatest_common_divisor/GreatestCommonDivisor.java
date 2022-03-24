package control_statements_and_flow.greatest_common_divisor;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int firstNum, int secondNum) {
        if (firstNum < 10 || secondNum < 10) {
            return -1;
        }
        int greatestCommonDenominator = 0;
        for (int i = 1; i < 100; i++) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                greatestCommonDenominator = i;
            }
        }
        return greatestCommonDenominator;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
