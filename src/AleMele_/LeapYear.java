package AleMele_;
/*
[If statements, operators]

Create a program that will accept a year. Check if the year is a leap year.
If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"

Hint: Lets say if a number is evenly divisible by 4 it is a leap year
 */

public class LeapYear {
    public static void main(String[] args) {
        int num = 2003;
        if (num%4==0){
            System.out.println(num + " is a leap year");
        }else{
            System.out.println(num + " is not a leap year");
        }
    }
}
