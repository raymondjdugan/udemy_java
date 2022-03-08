package method_challenges.minutes_to_years_and_days_calculator;

public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long minutesInDay = 1440;
        long minutesInYear = 525600;
        System.out.printf("%d min = %d y and %d d%n", minutes, minutes / minutesInYear, (minutes / minutesInDay) % 365);
    }

    public static void main(String[] args) {
        printYearsAndDays(-525600); // →should print "525600 min = 1 y and 0 d"

        printYearsAndDays(1051200);// →should print "1051200 min = 2 y and 0 d"

        printYearsAndDays(561600); // →should print "561600 min = 1 y and 25 d"
    }
}
