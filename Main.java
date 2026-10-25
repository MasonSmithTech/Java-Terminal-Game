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
            System.out.println("Outside, you see a forest to your right and water to your left, with city lights faintly shining in the distance.");
            System.out.println("Do you want to go to the forest or the water? f/w");
            Scanner scanner67 = new Scanner(System.in);
            String input67 = scanner67.nextLine();
            if (input67.equals("f")) {
                System.out.println("You turn and march towards the forest, the trees seeming larger then you initially realized.");
                forest();
            } else if (input67.equals("w")) {
                System.out.println("You head towards the water, the waves lapping at your feet... you spot a raft behind a rock...");
                System.out.println("Hopping on the raft, the city lights shining across the bay seem to be getting brighter... you are almost free.");
                System.out.println("as you paddle through the fridgid water... you notice a dorsel fin pierce the waters surface.... this cant be good.");
                System.out.println("you cant outrun the shark... better luck next time!");
                dead();
            }
        }

        if (number == 2) {
            System.out.println("You open the door, and you hear a click. You look down and see a trapdoor open beneath you, you fall into the darkness below");
            System.out.println("When you come to, your in the middle of the forest.");
            forest();
        }

        if (number == 3) {
            System.out.println("You open the door, and you enter a room empty except for a piano in the corner, covered in dust.");
            System.out.println("You sit down at the piano and notice that 3 key have no dust at all... g, a and b. You are sure this is a clue, so you play a key.");
            keys(false, false);
            
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
                System.out.println("Hopping on the raft, the city lights shining across the bay seem to be getting brighter... you are almost free.");
                System.out.println("as you paddle through the fridgid water... you notice a dorsel fin pierce the waters surface.... this cant be good.");
                System.out.println("you cant outrun the shark... better luck next time!");
                dead();
            }
        }

        if (input.equals("b")) {
            System.out.println("You try and turn back... but its too late... they found you... better luck next time!");
            dead();
        }
    }

    public static void keys(boolean jem, boolean map) {
        System.out.println("Which key do you want to play? g/a/b");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("g")) {
            if (jem == false) {
                System.out.println("You press down the key and a low g plays... you hear a small rattling noise, and a small chute opens... a small jem rolls out.");
                jem = true;
                again(jem, map);
            } else if (jem == true) {
                System.out.println("You press down the key and a low g plays... nothing happens.");
                again(jem, map);
            }
        }

        if (input.equals("a")) {
            System.out.println("You press the key, but no sound comes out... try another key?");
            again(jem, map);
        }

        if (input.equals("b")) {
            if (map == false) {
                System.out.println("You press down the key and a low b plays... you hear a small click and a small door opens... revealing a crumpled map.");
                map = true;
                again(jem, map);
            } else {
                System.out.println("You press down the key and a low b plays... nothing happens.");
                again(jem, map);
            }
        }

    }

    public static void again(boolean jem1, boolean map1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play another piano key? y/n");
        if (scanner.nextLine().equals("y")) {
            keys(jem1, map1);
        } else {
            if (jem1 && map1) {
                System.out.println("Glancing down at the map, you see it points towards the corner of the room... you walk over and start looking.");
                System.out.println("In the corner of the room, covered in dust, you find a staff. As you run your hands over the hilt, you feel a small notch... the same size as the jem.");
                System.out.println("You click the jem into place, and in a flash of light.... you teleport to the woods");
                forest();
            } else {
                System.out.println("unsure what to do... you stare at the wall...you know they are coming... better luck next time!");
                dead();
            }
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
        maze();
    }

    public static void maze() {
        boolean t1 = false;
        boolean t2 = false;
        boolean t3 = false;
        boolean t4 = false;
        boolean t5 = false;
        boolean t6 = false;
        boolean t7 = false;
        boolean t8 = false;

        System.out.println("You enter the maze, knowing you must get all 8 turns right in order to get through.");
        //turn 1
        System.out.println("You reach the first turn, do you go left or right? l/r");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("l")) {
            t1 = true;
            System.out.println("You made the correct choice...so you keep walking");
        }

        else {
            System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
            maze();
        }

        //turn 2
        if (t1) {
            System.out.println("you reached the second turn... now what do you do? l/r");
            String input2 = scanner.nextLine();
            if (input2.equals("r")) {
                t2 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

        //turn 3
        if (t2) {
            System.out.println("you reached the third turn... now what do you do? l/r");
            String input3 = scanner.nextLine();
            if (input3.equals("l")) {
                t3 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

        //turn 4
        if (t3) {
            System.out.println("you reached the fourth turn... now what do you do? l/r");
            String input4 = scanner.nextLine();
            if (input4.equals("r")) {
                t4 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

        //turn 5
        if (t4) {
            System.out.println("you reached the fifth turn... now what do you do? l/r");
            String input5 = scanner.nextLine();
            if (input5.equals("r")) {
                t5 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

        //turn 6
        if (t5) {
            System.out.println("you reached the sixth turn... now what do you do? l/r");
            String input6 = scanner.nextLine();
            if (input6.equals("l")) {
                t6 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

        //turn 7
        if (t6) {
            System.out.println("you reached the seventh turn... now what do you do? l/r");
            String input7 = scanner.nextLine();
            if (input7.equals("r")) {
                t7 = true;
                System.out.println("You made the correct choice...so you keep walking");
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }
        //turn 8
        if (t7) {
            System.out.println("you reached the eighth FINAL turn... now what do you do? l/r");
            String input8 = scanner.nextLine();
            if (input8.equals("r")) {
                t8 = true;
                System.out.println("You made the correct choice...allowing you to walk out of the maze... and deeper into the next part of the cave.");
                caveSecond();
            }

            else {
                System.out.println("You made the wrong choice... you must start from the beginning of the maze!");
                maze();
            }
        }

    
    }

    public static void caveSecond() {
        System.out.println("As you continue walking through the cave, the glowing light seems to be getting brighter.");
        System.out.println("as you turn the corner, you come face to face with a wall of fire, the heat radiating off your face.");
        System.out.println("beyond the blaze, you can clearly see a door... but the fire is in the way... will you leap across or turn back? l/b");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("l")) {
            System.out.println("taking a deep breath you leap across the fire, the heat burning your skin... but you make it across.");
            System.out.println("to your dismay, the door has a passcode, which you are unsure of...");
            passcode();
        }
        else {
            System.out.println("you turn back, and spot them.... they followed you through the maze... better luck next time");
            dead();
        }
    }

    public static void passcode() {
        System.out.println("the passcode on the wall has 3 digits, all numbers 0-9... you must make a guess");
        System.out.println("you must guess the passcode... you know their favorite number is 6.... good luck! (enter a 3 digit guess)");
        Scanner scanner = new Scanner(System.in);
        int passcoder = scanner.nextInt();
        if (passcoder == 676) {
            System.out.println("wow... such a lucky guess!");
            System.out.println("the door clicks... you are able to walk through.");
            theEnd();
        }
        else {
            System.out.println("maybe better luck next time man... that was NOT right!");
            passcode();
        }
    }

    public static void theEnd() {
        System.out.println("as you walk through the door.... the smell of smoke meets your nostrals... it smells familiar... like the smog from the city where u were living");
        System.out.println("a wave of familiarity washes over you, and you stop for a moment... suddenly, you are back outside your apartment as if nothing happened...");
        System.out.println("was that just a dream... a nightmare?");
        System.out.println("As you turn the handle of your front door... you notice a note taped to the front glass... .picking it up... it reads 'good job kid'");
        System.out.println("you chuckle softly before going intop your bedroom and lying down... tired from the dream you were just a part of");

        System.out.println(" ");
        System.out.println("COngradulations... you won");
        System.out.println(" ");
        System.out.println("reload of you wish to play again...");
    }
}

