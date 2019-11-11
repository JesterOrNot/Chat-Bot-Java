import java.util.Scanner;

class ChatBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // controls whether the chat bot is still talking
        boolean keepRunning = true;

        // inital chat bot message
        System.out.println("Hello!");

        // a loop that keeps reading in what the user types in
        // it then prints out a response from the chat bot
        while (keepRunning) {
            System.out.print("input> ");
            String userSaid = sc.nextLine();
            String userSaid2 = userSaid.toLowerCase();
            String response = getResponse(userSaid2);
            System.out.println(response);
        }
    }

    // method that determines what the chat bot says
    // based on the users input
    public static String getResponse(String userInput) {
        if (userInput.contains("programming")) {
            return "I was programmed in Java. I am done talking.";
        } else if (userInput.equals("bye")) {
            return "Ok, Bye!";
        } else if (userInput.length() == 0) {
            return "I can't hear you!";
        } else {
            int randNum = (int) (Math.random() * 5) + 1;
            switch(randNum) {
                case 1:
                    return "Very interesting";
                case 2:
                    return "Cool!";
                case 3:
                    return "Ok!";
                case 4:
                    return "Got it!";
                default:
                    return "Hmmm...";
            }
        }
    }
}