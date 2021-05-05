package OfficeHours.Practice_03_02_2021;


/*

================================================

Make a class PersonInfo
make a main method

Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information



    - Challenge: print your name in a cool way (unicode)
    - Challenge: char star

====================================================

 */
public class PersonInfo {
    public static void main(String[] args) {
        String name = "Andrei Diaconu";
        byte age = 29;
        char gender = 'M';
        boolean student = true;
        short nuberOfSiblings = 1;
        long favoritNumber = 13L;
        int numberOfSeasonInYourArea = 4;
        double birthDate = 12.01;
        int year = 1991;
        String fullBirthdayDate = "12.01.1991";
        String favoriteQuote = "anyone";

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(student);
        System.out.println(nuberOfSiblings);
        System.out.println(favoritNumber);
        System.out.println(numberOfSeasonInYourArea);
        System.out.println( birthDate +"."+ year);
        System.out.println(year);
        System.out.println(fullBirthdayDate);
        System.out.println(favoriteQuote);

        double a = birthDate + '.' + year;


        System.out.println(birthDate);
        System.out.println("Age");



        //Other practice


    }

}
