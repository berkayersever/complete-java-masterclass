public class Main {

    public static void main(String[] args) {
        calculateScore("Berkay", 500);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
}