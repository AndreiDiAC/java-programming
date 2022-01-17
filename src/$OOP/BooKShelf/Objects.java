package $OOP.BooKShelf;

import OfficeHours.Practice_06_21.B;
import day56_abstraction.Transportation.SelfDrivable;

public class Objects {
    public static void main(String[] args) {
        System.out.println(Book.capitalize("THE"));
        System.out.println(Book.isTitleWord("The"));

        Book b1 = new Book();
        b1.setAuthor("");
        System.out.println(b1.getAuthor());

        Book.capitalize(b1.getAuthor());

        b1.setTitle("the Chronicles OF TrumP");
        System.out.println(b1.getTitle());

        System.out.println(b1);

        Book b2 = new Book(12,"anDrei dIaconu","the boOK of baNAnas",260);
        System.out.println(b2);

        Shelf.getTheBooks();
        System.out.println(Shelf.isShelfEmpty());
        System.out.println(Shelf.addBook(b2));
        System.out.println(Shelf.addBook(100, "j.K. rowLing", "harry potter", 556));

        Book book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
        Book book2 = new Book(414, "Dan Brown" ,"the da Vinci coDe",1532);
        Book book3 = new Book(123,"dan brOwn","Anything",400);

        Shelf.addBook(book1);
        Shelf.addBook(book2);
        Shelf.addBook(book3);

        System.out.println(Shelf.getTheBooks());

        System.out.println(Shelf.getTitleByID(45));
        System.out.println(Shelf.findBookByPartialTitle("giving"));
        System.out.println(Shelf.getAllBooksForAuthor("dan Brown"));
        Shelf.removeBook(123);
        System.out.println(Shelf.getTheBooks());
        Shelf.removeBook("dan brown");
        System.out.println(Shelf.getTheBooks());
        Shelf.clearBookShelf();
        System.out.println(Shelf.getTheBooks());

    }
}
