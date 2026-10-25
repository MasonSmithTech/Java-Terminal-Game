import java.util.Scanner;

public class MathQuiz {

    public static int score = 0;
    public static void main(String[] args) {

        System.out.println("Welcome to the 5 question math quiz!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want easy, medium, or hard difficulty 10 question quiz? e/m/h");
        String difficulty = scanner.nextLine();

        //difficulty decider!
        if (difficulty.equals("e")) {
            System.out.println("You chose the easy quiz!");
            easy();
        }

        else if (difficulty.equals("m")) {
            System.out.println("You chose the medium quiz!");
            medium();
        }

        else if (difficulty.equals("h")) {
            System.out.println("You chose the hard quiz!");
            hard();
        }
    }

    public static void easy() {
        //q1
        System.out.println("Q1: What is 14 + 9?");
        System.out.println("A) 21 \nB) 23 \nC) 24 \nD) 25");
        System.out.println("What is the answer? a/b/c/d");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("b")) {
            right();
        }
        else {
            wrong();
        }

        //q2
        System.out.println("Q2: What is 36 - 18?");
        System.out.println("A) 16 \nB) 20 \nC) 18 \nD) 2");
        System.out.println("What is the answer? a/b/c/d");
        String answer2 = scanner.nextLine();
        if (answer2.equals("c")) {
            right();
        }
        else {
            wrong();
        }

        //q3
        System.out.println("Q3: What is 7 x 8?");
        System.out.println("A) 56\nB) 48 \nC) 54 \nD) 64");
        System.out.println("What is the answer? a/b/c/d");
        String answer3 = scanner.nextLine();
        if (answer3.equals("a")) {
            right();
        }
        else {
            wrong();
        }

        //q4
        System.out.println("Q4: What is 45 / 5?");
        System.out.println("A) 8\nB) 10 \nC) 7 \nD) 9");
        System.out.println("What is the answer? a/b/c/d");
        String answer4 = scanner.nextLine();
        if (answer4.equals("d")) {
            right();
        }
        else {
            wrong();
        }

        //q5
        System.out.println("Q5: What is half of 64?");
        System.out.println("A) 24\nB) 32\nC) 34\nD) 36");
        System.out.println("What is the answer? a/b/c/d");
        String answer5 = scanner.nextLine();
        if (answer5.equals("b")) {
            right();
        }
        else {
            wrong();
        }

        System.out.println(" ");
        System.out.println("You scored: " + score + " / 5");easy();

    }

    public static void medium() {
        //q1
        System.out.println("Q1: What is 125 + 278?");
        System.out.println("A) 393 \nB) 413 \nC) 403 \nD) 413");
        System.out.println("What is the answer? a/b/c/d");
        Scanner scanner = new Scanner(System.in);
        String answer11 = scanner.nextLine();
        if (answer11.equals("c")) {
            right();
        }
        else {
            wrong();
        }
        
        //q2
        System.out.println("Q2: What is 144 / 12?");
        System.out.println("A) 12 \nB) 14 \nC) 10 \nD) 16");
        System.out.println("What is the answer? a/b/c/d");
        String answer12 = scanner.nextLine();
        if (answer12.equals("a")) {
            right();
        }
        else {
            wrong();
        }  

        //q3
        System.out.println("Q3: What is 15 x 12?");
        System.out.println("A) 160 \nB) 170 \nC) 175 \nD) 180");
        System.out.println("What is the answer? a/b/c/d");
        String answer13 = scanner.nextLine();
        if (answer13.equals("d")) {
            right();
        }
        else {
            wrong();
        }

        //q4
        System.out.println("Q4: What is 3/4 of 20?");
        System.out.println("A) 12\nB) 15\nC) 16\nD) 18");
        System.out.println("What is the answer? a/b/c/d");
        String answer14 = scanner.nextLine();
        if (answer14.equals("b")) {
            right();
        }
        else {
            wrong();
        }

        //q5
        System.out.println("Q5: A movie starts at 2:35 PM and lasts 1 hour and 45 minutes. When is it done? ");
        System.out.println("A) 4:10 PM \nB) 4:15 PM \nC) 4:20 PM \nD) 4:30 PM");
        System.out.println("What is the answer? a/b/c/d");
        String answer15 = scanner.nextLine();
        if (answer15.equals("c")) {
            right();
        }
        else {
            wrong();
        }

        System.out.println(" ");
        System.out.println("You scored: " + score + " / 5");

    }

    public static void hard() {
        //q1
        System.out.println("Q1: What is 18^2?");
        System.out.println("A) 324 \nB) 288 \nC) 342 \nD) 361");
        System.out.println("What is the answer? a/b/c/d");
        Scanner scanner = new Scanner(System.in);
        String answer21 = scanner.nextLine();
        if (answer21.equals("a")) {
            right();
        }
        else {
            wrong();
        }  

        //q2
        System.out.println("Q2: Solve 3x + 7 = 28");
        System.out.println("A) 5\nB) 6\nC) 8\nD) 7");
        System.out.println("What is the answer? a/b/c/d");
        String answer22 = scanner.nextLine();
        if (answer22.equals("d")) {
            right();
        }
        else {
            wrong();
        }

        //q3
        System.out.println("Q2: What is 2/3 + 1/4 ?");
        System.out.println("A) 3/7\nB) 11/12 \nC) 5/7\nD) 3/12");
        System.out.println("What is the answer? a/b/c/d");
        String answer23 = scanner.nextLine();
        if (answer23.equals("b")) {
            right();
        }
        else {
            wrong();
        }

        //q4
        System.out.println("Q3: A triangle has angle measures 45 and 65, what is the third angle?");
        System.out.println("A) 60\nB) 80\nC) 70\nD) 90");
        System.out.println("What is the answer? a/b/c/d");
        String answer24 = scanner.nextLine();
        if (answer24.equals("c")) {
            right();
        }
        else {
            wrong();
        }

        //q4
        System.out.println("Q5: What is 15% of 240?");
        System.out.println("A) 36\nB) 24\nC) 40\nD) 48");
        System.out.println("What is the answer? a/b/c/d");
        String answer25 = scanner.nextLine();
        if (answer25.equals("a")) {
            right();
        }
        else {
            wrong();
        }

        System.out.println(" ");
        System.out.println("You scored: " + score + " / 5");
    }

    
    
    
    
    public static void right() {
        System.out.println("Correct!");
        score++;
    }
    
    public static void wrong() {
        System.out.println("Sorry, Thats incorrect.");
    }
}