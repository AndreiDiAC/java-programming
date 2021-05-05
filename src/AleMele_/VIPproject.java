package AleMele_;
import java.util.*;
public class VIPproject {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        String interviewProceeding = "";
        do {
            System.out.println("Interviewee name is: " + pickPlayer());
            String[] IQ = RandomQuestion();
            System.out.println(IQ[0] + "?");
            System.out.println("You have 10 seconds to think then timer will start counting");
            timer(10);
            System.out.println("\nStart your answer");
            timer(30);
            System.out.println("");
            System.out.println("\t \t Times is Up!  ");
            System.out.println("");
            System.out.println("Suggested answer for this question is :\n " + IQ[1]);
            System.out.println("*****Thank you for your participation*****");
            System.out.println("Do you want to proceeding the interview? yes or no");
            interviewProceeding = scan.next();

        } while(interviewProceeding.equals("yes"));

    }
    //pick Random player
    public static String pickPlayer () {
        String [] peoples = {   "Aziz", "Kibi", "sTaN",
                "Edward",
//                "Bahruz",
                "Andrei",
                "Onurcan",
//                "Tatyana",
                "Biniyam",
                "Elgun",
//                "Andrew",
                "Nevzat",
                "Nijat",
//                "Serhii"
        };
        Random rand =new Random();
        int indexpeople = rand.nextInt(peoples.length);
        return peoples[indexpeople];
    }
    // Random question from the pool
    public static String[] RandomQuestion () {
        String [] randomQuesionAndAnswer = new String [2];
        String [][] questionAndAnswer = {{"Q1. What are the phases / steps of SDLC",
                "Q2. What are the disadvantages of waterfall", "Q3. What do you like about agile?",
                "Q4. What challenges can you have while working in agile environment?"},{"Ans(forQ1): SDLC is...",
                "Ans(forQ2):  disadvantages of waterfall is ...", "Ans(forQ3):  I like  agile because ..",
                "Ans(forQ4):  Challenge in agile environment?"}};

        Random rand = new Random();
        int index= rand.nextInt(questionAndAnswer[0].length);

        randomQuesionAndAnswer[0] = questionAndAnswer[0][index];
        randomQuesionAndAnswer[1] = questionAndAnswer[1][index];

        return  randomQuesionAndAnswer;
    }
    public static void timer (int maxtime) throws InterruptedException {
        for (int i=maxtime; i>=0; i--) {
            System.out.print(i+" ");
            Thread.sleep(1000);
        }

    }


}
