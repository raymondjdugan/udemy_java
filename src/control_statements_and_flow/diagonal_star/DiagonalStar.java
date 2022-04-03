package control_statements_and_flow.diagonal_star;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || col == 1 || row == number || col == number) {
                    System.out.print("*");
                } else if(row == col) {
                    System.out.print("*");
                } else if(col == (number - row) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
    }
}
