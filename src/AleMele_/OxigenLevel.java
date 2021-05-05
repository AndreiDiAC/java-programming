package AleMele_;
/*
[Oxygen level - If statements, operators]

You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level
x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%
 */
public class OxigenLevel {
    public static void main(String[] args) {
        int oxigen = 80;
        if (oxigen>= 90){
            System.out.println("Your tank is full!");
        }
        if (oxigen >= 80 && oxigen<90){
            System.out.println("Still ok!");
        }
        if (oxigen>= 70 && oxigen<80){
            System.out.println("Don't go to far!");
        }
        if (oxigen>= 60 && oxigen <70){
            System.out.println("Start to head back!");
        }
        if (oxigen>=50 && oxigen <60){
            System.out.println("Be careful. Now you at 50%");
        }
    }
}
