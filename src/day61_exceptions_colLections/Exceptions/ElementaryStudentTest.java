package day61_exceptions_colLections.Exceptions;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); // print error stack trace and continue. does not stop code

        }

        System.out.println("---- Execution completed ------");

        try{
            throw new IllegalArgumentException("Error");
        }catch (Exception e){
            System.out.println("Caught the expcetion");
        }

    }
}
