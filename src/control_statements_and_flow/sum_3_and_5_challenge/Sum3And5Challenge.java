package control_statements_and_flow.sum_3_and_5_challenge;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        int conditionsMet = 0;
        int total = 0;
        for (int i = 1; i <= 1000 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
                System.out.println(i + " is divisible by 3 and 5");
                conditionsMet++;
                if (conditionsMet == 5) {
                    break;
                }
            }
        }
        System.out.println("\n"+ total + " is the total of the first 5 numbers that are divisible by 3 and 5" );
    }
}
