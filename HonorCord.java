import java.util.Scanner;

public class HonorCord {
    public static void main(String[] args) {
        System.out.println("Hello... Welcome to the Honor Cord Calculator... you can use this tool in order to decide if you qualify for an honor cord or not!");
        System.out.println("To get started, please enter your first and last name: ");
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        System.out.println("Nice to meet you " + studentName + "... lets get started on calculating your eligibility!");

        System.out.println(" ");
        
        //Quarter grades!
        System.out.println("Lets start by collecting your quarter grades " + studentName + "!");
        System.out.println(" ");
        //q1
        System.out.println("First, enter your grade percentage for Quarter 1 (include decimals).");
        Double q1 = scanner.nextDouble();
        System.out.println(" "); //indent
        
        //q2
        System.out.println("Next, enter your grade percentage for Quarter 2 (include decimals).");
        Double q2 = scanner.nextDouble();
        System.out.println(" "); //indent

        //q3
        System.out.println("Now, enter your grade percentage for Quarter 3 (include decimals),");
        Double q3 = scanner.nextDouble();
        System.out.println(" "); //indent

        //q4
        System.out.println("Finally, enter your grade percentage for Quarter 4 (include decimals),");
        Double q4 = scanner.nextDouble();
        System.out.println(" "); //indent

        //Midterm + final 
        System.out.println("Now, lets collect your Midterm and Final grades!");
        System.out.println(""); //indent

        //midterm
        System.out.println("Enter your Midterm grade (include decimals).");
        Double midterm = scanner.nextDouble();
        System.out.println(" "); //indent

        //final
        System.out.println("Enter your Final grade (include decimals).");
        Double Ffinal = scanner.nextDouble(); //stupid final keyword
        System.out.println(" "); //indent

        //Funny message... 3 different potential messages
        int messRand = ((int)(Math.random() * 3));
        
            if (messRand == 0) {
            System.out.println("Wow not bad... for a 2 year old!");
            }
            if (messRand == 1) {
            System.out.println("A lot better then I was expecting from you...");
            }
            if (messRand == 2) {
            System.out.println("I could do better... but not to bad!");
            }

            System.out.println(" "); //indent
        
        
        // final gpa
        Double ofGPA = ((q1 * 0.20) + (q2 * 0.20) + (q3 * 0.20) + (q4 * 0.20) + (midterm * 0.10) + (Ffinal * 0.10));
        System.out.println("Drumroll please........");
        System.out.println(" "); //indent
        System.out.println("Congradulations " + studentName + ", Your GPA is: " + ofGPA); 
        System.out.println(" "); //indent

        //Volunteer
        System.out.println("Now I need to know... how many hours of community service did you do this year? (integer hour value).");
        int comSer = scanner.nextInt();
        System.out.println(" "); //indent

        if (comSer <= 5) {
            System.out.println("Do you not care about our community???");
        }
        else {
            System.out.println("Im happy your helping our community!!");
        }

        System.out.println(" "); //indent 

        //Absences
        System.out.println("We are almost there.... Just need your absences.");
        System.out.println(" "); //indent

        System.out.println("How many absences do you have this year? (integer absence value).");
        int abCount = scanner.nextInt();

        // transition
        System.out.println(" ");
        System.out.println(" Please hold while I calculate your eligability!!!");

        //eligability calculations
        if (abCount >= 19) { //works
            deny();
        }
        else if (abCount <= 18){
            if (ofGPA >= 95.0 || comSer >= 30) { //works
                accept();
            }
            else if (ofGPA >= 90.0 && comSer >= 5) { //works
                accept();
            }
            else if (ofGPA >= 85 && comSer >= 5 && abCount <= 10) { //works
                accept();
            }
            else if (abCount == 0 && (ofGPA >= 80 || comSer >= 20)) { //works
                accept();
            }
            else {
                deny();
            }
        }

        System.out.println("Thanks for using my software!");
        System.out.println(" ");
    
    }

//methods
public static void deny() {
    System.out.println(" ");
    System.out.println("Sorry, you did not meet one or more of the requirments necessary to earn an Honor Cord");
    System.out.println("Better luck next year!");
    System.out.println(" "); //indent
}

public static void accept() {
    System.out.println(" ");
    System.out.println("Congradulations, you met the requirements to earn an Honor Cord!");
    System.out.println("Hopefully you can earn one again next year!");
    System.out.println(" "); //indent
}

       
}
