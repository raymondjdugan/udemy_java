package control_statements_and_flow.input_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }
        int sum = 0;
        int avg = 0;
        if (numbers.size() != 0) {
            for (Integer number : numbers) {
                sum += number;
            }
            avg = (int) Math.round((double) sum / numbers.size());
        }
        System.out.println("SUM = " + sum + " " + "AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
