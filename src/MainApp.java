import java.util.Scanner;


public class MainApp {

    private static String readString(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void testScoreChecker() {
        System.out.println("Testing ScoreChecker");
        while (true) {
            String input = MainApp.readString("Enter word:");
            if (input.length() == 0) {
                break;
            }
            int result = ScoreChecker.getScore(input.toUpperCase());
            System.out.println(input + " [" + result + " points]");
        }
    }

    public static void main(String[] args) {
        MainApp.testScoreChecker();
    }
}
