import java.util.Scanner;

/**
 * Chat bot thing!
 */
public class ChatBot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello I am an un-intelligent bot! \nWho are you?: ");
        String name = input.nextLine();
        if (name.equals("")) {
            askAgain();
        }
        System.out.println("Well hello " + name);
        System.out.print("Well, " + name + " what would you like to talk about?: ");
        boolean notDone = true;
        while (notDone) {
            String userInput2 = input.nextLine();
            if (userInput2.equals("nothing")) {
                System.out.println("Ok, Bye!");
                return;
            }
        }
    }

    public static void askAgain() {
        //
    }
}