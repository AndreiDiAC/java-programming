package AleMele_;
/*
Write a program that will accept a number representing the month.
Print out how many days are in that given month. Assume February (2) has 28 days
Ex:
    Input: 1
    Output: 31 days

    Input: 2
    Output: 28 days
 */
public class NumberMonth {
    public static void main(String[] args) {
        int numberMonth = 1;

        if(numberMonth == 2 ) {
            System.out.println("28 days");
        }else if(numberMonth %2 == 0){
            System.out.println("30 days");
        }else{
            System.out.println("31 days");
        }
    }
}
