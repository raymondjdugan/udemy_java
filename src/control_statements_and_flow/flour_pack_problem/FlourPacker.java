package control_statements_and_flow.flour_pack_problem;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int sum = (bigCount * 5) + smallCount;
            if (sum < goal) {
                return false;
            } else if (goal % 5 <= smallCount) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }
}
