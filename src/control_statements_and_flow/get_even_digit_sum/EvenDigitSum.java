package control_statements_and_flow.get_even_digit_sum;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        String [] digitsFromString = String.valueOf(number).split("");
        int sumOfEvenNums = 0;
        for (String num : digitsFromString) {
            if (Integer.parseInt(num) % 2 == 0) {
                sumOfEvenNums += Integer.parseInt(num);
            }
        }
        return sumOfEvenNums;
    }
}
