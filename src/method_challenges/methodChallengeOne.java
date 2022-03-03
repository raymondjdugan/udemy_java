package method_challenges;

public class methodChallengeOne {
    public static void main(String[] args) {
        displayHighScorePosition("Raymond", calculateHighScorePosition(1500));
        displayHighScorePosition("Raymond", calculateHighScorePosition(500));
        displayHighScorePosition("Raymond", calculateHighScorePosition(400));
        displayHighScorePosition("Raymond", calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.printf("%s got position %d on the high score table.%n", name, position);
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position =  3;
        }
        return position;
    }
}
