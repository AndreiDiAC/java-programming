package AleMele_;
/*
[Author] - Look at CappuccinoBuyer from class for an idea

You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.
 Given the genre name figure out: average page length, average profit, average number of sequels,
 average number of countries published in.

Make variables for all of that information. Given empty defaults for all except the neighborhood name.
 Print the information once at the end.

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
 */
public class CappuccinoBuyer {
    public static void main(String[] args) {
        String gender = "Short Story";
        int pageLength, profit, sequels, countries;

        switch (gender){
            case "Fantasy":
                System.out.println("page length - " + (pageLength = 500));
                System.out.println("profit - " + (profit = 1_000_000));
                System.out.println("sequels - " + (sequels = 5));
                System.out.println("countries - " + (countries = 50));
                break;
            case "Detective":
                System.out.println("page length - " + (pageLength = 350));
                System.out.println("profit - " + (profit = 700_000));
                System.out.println("sequels - " + (sequels = 3));
                System.out.println("countries - " + (countries = 45));
                break;
            case "Science Fiction":
                System.out.println("page length - " + (pageLength = 150));
                System.out.println("profit - " + (profit = 300_000));
                System.out.println("sequels - " + (sequels = 4));
                System.out.println("countries - " + (countries = 30));
                break;
            case "Short Stories":
                System.out.println("page length - " + (pageLength = 350));
                System.out.println("profit - " + (profit = 700_000));
                System.out.println("sequels - " + (sequels = 1));
                System.out.println("countries - " + (countries = 40));
                break;
        }

    }
}
