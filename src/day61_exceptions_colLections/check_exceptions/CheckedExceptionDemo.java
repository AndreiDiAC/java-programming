package day61_exceptions_colLections.check_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("About to sleep for 5 seconds");
        /**
         * Thread.sleep(1000); causes/throws on InterruptedException, which is a  checked exception
         * 1) HANDLING USING TRY CATCH
         */


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * DECLARE USING THROWS keyword
         * public static void sleep(int second) throws InterruptedException{
         *      Thread.sleep(second * 1000);
         */

        System.out.println("Woke up after 5 seconds");
    }
}
