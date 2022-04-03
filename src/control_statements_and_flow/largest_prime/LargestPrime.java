package control_statements_and_flow.largest_prime;

public class LargestPrime {
    public static int getLargestPrime(int number){
        int i = 0;
        if(number<=1){
            return -1;
        }

        for(i=2; i <= number; i++){
            if(number%i == 0){
                number/= i;
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
//        getLargestPrime(16);
    }



}
