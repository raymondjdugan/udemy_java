package control_statements_and_flow.number_palindrome;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        String [] forwardNums  = String.valueOf(number).split("");
        StringBuilder reversedNums = new StringBuilder();
        for (int i = forwardNums.length - 1; i >=0; i--) {
            System.out.println(reversedNums);
            if (forwardNums[i].equals("-")) {
                reversedNums.insert(0,"-");
                continue;
            }
            reversedNums.append(forwardNums[i]);
        }
        System.out.println("Num: " + number);
        System.out.println("Rev Num: " + reversedNums.toString());
        return String.valueOf(number).equals(reversedNums.toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
}
