package AleMele_;
/*
[If statements, operators]

Write a program that will accept your salary amount.
Then also ask the user if they are full time or not (boolean).
If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000.
Print the final salary.
 */
public class FullTimeOrPartTime {
    public static void main(String[] args) {
        double salary = 100_000;
        boolean isFullTime = true;
        if (isFullTime){
            salary += 20_000;
        }else{
            salary -= 5000;
        }
        System.out.println("He's salary is " + salary );
    }
}
