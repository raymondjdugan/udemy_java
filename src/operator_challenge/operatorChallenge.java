package operator_challenge;

public class operatorChallenge {
    public static void main(String[] args) {
        double twenty = 20.00d;
        double eighty = 80.00d;
        double total = (twenty + eighty) * 100d;
        double remainder = total % 40.00d;
        boolean hasRemainder = remainder == 0;
        if (!hasRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
