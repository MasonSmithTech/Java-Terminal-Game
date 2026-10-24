import java.util.Scanner;

public class Main {
    public static void level1() {
        System.out.println("opening the door, you come to a hallway... will yout turn left or right? l/r");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("l")) {
            System.out.println("you turn left and walk down the hallway, stopping at a row oof 3 doors.");
            leftL1();
        } else if (input.equals("r")) {
            System.out.println("you turn right and walk down the hallway, stopping at a single locked door.");
            rightL1();
          
        } else {
            System.out.println("Dude what the heck... your a chud if u dont wanna play this game!");
        }
    }

    public static void leftL1() {
        System.out.println("You stop in fron of the three doors... which will you pick? 1/2/3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("You open the door, and you are met with a hust of fresh air, you see the viel of night before you... you step outside");
        }

        if (number == 2) {
            System.out.println("You open the door, and you hear a click. You look down and see a trapdoor open beneath you, you fall into the darkness below");
            System.out.println("When you come to, your in the middle of the forest.");
            forest();
        }

        if (number == 3) {
            System.out.println("You open the door, and you enter a room empty except for a piano in the corner, covered in dust.");
        }
    }

    public static void rightL1() {
        System.out.println("Looking around, you see an object on the floor... a key. You pick it up and try the door... which opens!");
        System.out.println("Going through the door, you walk down a long curved hallway, where you find a window, moonlight shinging through it");
        System.out.println("You push on the window, and it swings open... do you want to exit the building or turn back? e/b");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("e")) {
            System.out.println("You jump out the window. Outside, you see a forest to your right and water to your left, with city lights faintly shining in the distance.");
            System.out.println("Do you want to go to the forest or the water? f/w");
            String input2 = scanner.nextLine();
            if (input2.equals("f")) {
                System.out.println("You turn and march towards the forest, the trees seeming larger then you initially realized.");
                forest();
            } else if (input2.equals("w")) {
                System.out.println("You head towards the water, the waves lapping at your feet... you spot a raft behind a rock...");
            }
        }

        if (input.equals("b")) {
            System.out.println("You try and turn back... but its too late... they found you... better luck next time!");
            dead();
        }
    }









    public static void main(String[] args) {
        
        // introduction and game start
        int stage = 0;
        System.out.println("Welcome to the greatest game of all time");
        System.out.println("Are you ready to play? y/n");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("y")) {
            System.out.println("Great! Let's play!");
            level1();
         
        } else {
            System.out.println("Dude what the heck... your a chud if u dont wanna play this game!");
            dead();
        }

        
        
    }

    public static void dead() {
        System.out.println("You are dead. Better luck next time!");
    }
    
    public static void forest() {
        System.out.println("as you walk through the forest, you suddenly find a cave... with a light glowing from inside... curious... you nervously walk inside");
        System.out.println("Inside, you find a maze... 8 turns in total. You can only go left or right at each turn. Good luck!");
    }
}
