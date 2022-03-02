package float_challenge;

import java.util.Scanner;

public class floatChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pounds would you like to convert?");
        double lbs = input.nextDouble();
        double kgs = .45359237d;
        double total = lbs * kgs;
        System.out.println(total);
    }
}
