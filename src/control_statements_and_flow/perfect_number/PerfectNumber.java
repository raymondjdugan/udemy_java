package control_statements_and_flow.perfect_number;

import java.util.ArrayList;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        ArrayList<Integer> perfectDivisors =  new ArrayList<>();
        for (int i = 1; i <= number - 1 ; i++) {
            if (number % i == 0) {
                perfectDivisors.add(i);
            }
        }
        int sumOfArrayList = 0;
        for (Integer num : perfectDivisors) {
            sumOfArrayList += num;
        }
        return sumOfArrayList == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
