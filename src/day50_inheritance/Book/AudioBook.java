package day50_inheritance.Book;

public class AudioBook extends Book {
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listen audio book:");
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Length = " + length);
        System.out.println("Narrator = " + narrator);
    }
}
