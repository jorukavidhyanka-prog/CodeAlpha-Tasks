import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("AI ChatBot Started!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("hello") || input.equals("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java AI ChatBot.");
            }
            else if (input.contains("how are you")) {
                System.out.println("Bot: I'm doing great. Thanks for asking!");
            }
            else if (input.contains("time")) {
                System.out.println("Bot: Please check your system clock for the current time.");
            }
            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day.");
                break;
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }

        scanner.close();
    }
}