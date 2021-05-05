package AleMele_month$$;

import java.util.Scanner;

/**
 [Personal Information - Scanner and If]
 Ask the user how many people they live with?
 if user lives with Less than 2 people: print "Live with less than 2 people"
 if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
 if the user lives with more than 6 people: print "Live with "more than 6 people"
 Ask the user what city they live in?
 Ask the user if the live in downtown ("yes or no")
 if you live downtown, ask them have you thought about moving to the suburbs? ("yes or
 no")
 if they have thought about it print "do it its great", if they have not print "You should
 think about it"
 Ask the user their favorite animal?
 Print "Wow %animal is a great animal"
 Ask the user how many pets they want?
 Print "Interesting, do you want %numberOfPets %favoriteAnimals?"

 */
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many people you live with?");
        int people = s.nextInt();

        if(people <=2){
            System.out.println("Live with less than 2 people");
        }else if(people >=3 && people <= 6){
            System.out.println("Live with 3 - 6 people");
        }else if (people > 6){
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city you live in?");
        String city = s.next();
        System.out.println("Are you leaving in DownTown?");
        String isDownTown = s.next();
        if(isDownTown.equals("yes")){
            System.out.println("Have you thought about moving to the suburbs?");
            String answer = s.next();
            if(answer.equals("yes")){
                System.out.println("Do it! Its Great!");
            }else if(answer.equals("no")) {
                System.out.println("You should think about it");
            }else{
                System.out.println("hmm..");

            }
        }else{
            System.out.println("hmm..");
        }
        System.out.println("What is your favorite animal?");
        String animal = s.next();
        System.out.println("WOW " + animal + " is a great animal");
        System.out.println("How many pets do you want?");
        int numberOfPets = s.nextInt();
        String favoriteAnimal = s.next();
        System.out.println("Interesting, do you want " + numberOfPets + " " + favoriteAnimal);
    }
}
