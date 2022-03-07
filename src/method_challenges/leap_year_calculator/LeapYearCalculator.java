package method_challenges.leap_year_calculator;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return year % 100 != 0 || (year % 100 == 0 && year %400 == 0);
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));
    }
}
