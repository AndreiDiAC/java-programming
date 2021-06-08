package day50_inheritance.Book;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro in Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.99;

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.narrator = "Altul";
        audioBook.length = 123;
        audioBook.price = 44.99;
        audioBook.title = "Selenium Book";
        audioBook.listen();

        System.out.println("---------------------");
        EBook eBook = new EBook();
        eBook.author = "Savitvh";
        eBook.title = "Java data structure";
        eBook.type = "programming";
        eBook.price = 59.99;
        eBook.size = 2;
        eBook.readBook();
    }

}
