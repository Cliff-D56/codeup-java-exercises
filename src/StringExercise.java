import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {
        String output = "We don't need no education";
        System.out.println(output.substring(0,17).concat("thought control"));
        System.out.println("Check \"this\" out!, \"s inside of \"s!");
        System.out.println("In windows, the main drive is usually C:\\");
        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");
        Bob();
    }

    public static void Bob() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Talk to Bob");
        String userInput = scanner.nextLine();
        while (!userInput.equals("No")) {
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, Chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine, Be that way");
            } else {
                System.out.println("Whatever");
            }
        System.out.println("Do you still want to talk to Bob? If not type in \"No\"");
            userInput = scanner.nextLine();
        }
    }
}
