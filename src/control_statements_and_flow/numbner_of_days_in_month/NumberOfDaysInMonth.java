package control_statements_and_flow.numbner_of_days_in_month;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                return year % 100 != 0 || (year % 100 == 0 && year %400 == 0);
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if (!isLeapYear(year) || month <= 1 || month >= 12)){
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 28;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(10000));
    }
}
