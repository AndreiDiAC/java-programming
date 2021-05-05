package AleMele_month$$.Loops;
/**
[Book Value]
Given a String book with all the text of your book. Figure out how much
you will make from your book.
Each chapter you have in your book will add 10 $ value to your book.
Go through your book and figure out the value of the book. Ignore case
sensitivity.
Check the next slide for the Book text you can use to test.
 */
public class BookValue {
    public static void main(String[] args) {
        String book = "Java textbook By Murodil. Chapter 1 datatypes and variables. Chapter 2 \n" +
                "conditional statements. chapter 3 String manipulation. Chapter 4 \n" +
                "Loops. Chapter 5 Arrays. Chapter 6 Methods. chapter 7 ArrayList. \n" +
                "chapter 8 instance and static. Chapter 9 Constructors. Chapter 10 \n" +
                "Encapsulation and Inheritance. Chapter 11 Abstraction and \n" +
                "Polymorphism. Chapter 12 Exceptions. Chapter 13 Collections. Chapter \n" +
                "14 Learn more.";
        int value = 0;
        int chapter = 0;

        for (int i = 0; i < book.length()-6; i++){
            String myWord = book.substring(i,i+7);
            if(myWord.equalsIgnoreCase("chapter")){
                value+= 10;
                chapter += 1;
            }
        }
        System.out.println(chapter + " Chapters -> value of the book: " + value );
    }
}
