package control_statements_and_flow.is_odd;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            return number % 2 != 0;
        }
        return false;
    }

    public static int sumOdd(int num1, int num2) {
        int total = 0;
        if (num1 > 0 && num2 >= num1) {
            for (int i = num1; i <= num2; i++) {
                if (isOdd(i)) {
                    total += i;
                }
            }
            return total;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
    }
}
