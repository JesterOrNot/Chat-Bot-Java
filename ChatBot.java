import java.util.Scanner;

/**
 * Chat bot thing!
 */
public class ChatBot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello I am an un-intelligent bot!: ");
        boolean notDone = true;
        while (notDone) {
            System.out.print("input> ");
            String userInput2 = input.nextLine();
            userInput2 = userInput2.toLowerCase();
            if (userInput2.equals("What wr")) {
                System.out.println("I was programmed in java. I am done talking.");
            } else if (userInput2.equals("bye")) {
                System.out.println("Ok, Bye!");
                return;
            } else if (userInput2.length() == 0) {
                System.out.println("I can't hear you!");
            } else {
                System.out.println("Very interesting");
            }
        }
    }
}