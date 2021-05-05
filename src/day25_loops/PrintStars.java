package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int i = 1;
             i <=15;
             i++){
            System.out.print("* ");
        }
        System.out.println();


        String myStarts = "";

        //fill 5 stars to myStarts variable.
        for (int stars = 1; stars <= 5; stars++){
            myStarts += "* ";
        }
        System.out.println("myStarts = " + myStarts.trim());

//        String mystars = "";
//        mystars = mystars + "* "; //or mystars += "* ";
//        System.out.println(mystars);
//        mystars = mystars + "* ";
//        System.out.println(mystars);
//        mystars = mystars + "* ";
//        System.out.println(mystars);
//        mystars = mystars + "* ";
//        System.out.println(mystars);
    }
}
