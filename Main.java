import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // introduction and game start
        int stage = 0;
        System.out.println("Welcome to the greatest game of all time");
        System.out.println("Are you ready to play? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println("Great! Let's play!");
            stage++;
        } else {
            System.out.println("Dude what the heck... your a chud if u dont wanna play this game!");
        }

        
    }
    
}
