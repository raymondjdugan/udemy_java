package method_challenges.teen_number_checker;

public class TeenNumberChecker {
    public static boolean hasTeen(int t1, int t2, int t3) {
        return t1 >= 13 && t1 <= 19 || t2 >= 13 && t2 <= 19 || t3 >= 13 && t3 <= 19;
    }

    public static boolean isTeen(int t1) {
        return t1 >= 13 && t1 <=19;
    }
}
