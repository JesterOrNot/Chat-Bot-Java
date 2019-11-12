import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ChatBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // controls whether the chat bot is still talking
        boolean keepRunning = true;

        // inital chat bot message
        System.out.println("Hello!");

        // a loop that keeps reading in what the user types in
        // it then prints out a response from the chat bot
        while (keepRunning) {
            System.out.print("\u001B[36minput> \u001B[0m");
            String userSaid = sc.nextLine();
            String userSaid2 = userSaid.toLowerCase();
            String response = getResponse(userSaid2);
            if (response.isEmpty()) {
                System.out.print("I can't hear you!");
            }
            System.out.println(response);
        }
        sc.close();
    }

    // method that determines what the chat bot says
    // based on the users input
    public static String getResponse(String userInput) {
        if (userInput.contains("programming")) {
            return "I was programmed in Java. I am done talking.";
        } else if (userInput.equals("bye")) {
            return "Ok, Bye!";
        } else if (userInput.isEmpty()) {
            return "";
        } else if (userInput.contains("no")) {
            return "Why are you so negative?!?";
        } else if (userInput.startsWith("hi") || userInput.startsWith("hey") || userInput.startsWith("hello")) {
            return "Hi, hope you are having a good day!";
        } else if (userInput.startsWith("i want ")) {
            Pattern pattern = Pattern.compile("i want (.*)");
            Matcher matcher = pattern.matcher(userInput);
            String aString = new String();
            while(matcher.find()) {
                aString = aString.concat("Would it make you happy if you had " + matcher.group(1));
            }
            return aString;
        } else {
            int randNum = (int) (Math.random() * 5) + 1;
            switch (randNum) {
            case 1:     return "Very interesting";
            case 2:     return "Cool!";
            case 3:     return "Ok!";
            case 4:     return "Got it!";
            default:    return "Hmmm...";
            }
        }    
    }
}