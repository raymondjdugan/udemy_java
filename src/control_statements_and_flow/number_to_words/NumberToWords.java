package control_statements_and_flow.number_to_words;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0 ) {
            System.out.println("Invalid Value");
            return;
        }
        String [] digitsOfNumber = String.valueOf(number).split("");
        for (String digit : digitsOfNumber) {
            switch(digit) {
                case "0":
                    System.out.print("Zero");
                    break;
                case "1":
                    System.out.print("One");
                    break;
                case "2":
                    System.out.print("Two");
                    break;
                case "3":
                    System.out.print("Three");
                    break;
                case "4":
                    System.out.print("Four");
                    break;
                case "5":
                    System.out.print("Five");
                    break;
                case "6":
                    System.out.print("Six");
                    break;
                case "7":
                    System.out.print("Seven");
                    break;
                case "8":
                    System.out.print("Eight");
                    break;
                case "9":
                    System.out.print("Nine");
                    break;
            }
        }
    }

    public static int reverse(int number) {
        String [] digitsOfNumber = String.valueOf(number).split("");
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = digitsOfNumber.length-1; i >= 0; i--) {
            if (digitsOfNumber[i].equals("-")) {
                reversedNumber.insert(0, "-");
                continue;
            }
            reversedNumber.append(digitsOfNumber[i]);
        }
        return Integer.parseInt(reversedNumber.toString());
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String [] digitsOfNumber = String.valueOf(number).split("");
        return digitsOfNumber.length;
    }

    public static void main(String[] args) {
        numberToWords(123);
        System.out.println(reverse(1234));
        System.out.println(getDigitCount(5200));
    }
}

