package AleMele_;
/*
[If statement, operators]

Write a java program that can identify if a person is eligible to vote for the president. Age of voting: 18.
Print "Eligible to vote" or "not eligible to vote".

    => To make it dynamic change the three angles to be Scanner inputs
 */
public class EligibleToVote {
    public static void main(String[] args) {
        int vote = 19;
        if (vote <= 18){
            System.out.println("You are not eligible to vote!");
        }else{
            System.out.println("Your are eligible to vote!");
        }
    }
}
