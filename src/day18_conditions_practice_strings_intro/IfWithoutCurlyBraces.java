package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";
        if (todaysClass.equals("java"))
            System.out.println("java is fun");
//        System.out.println("orice");
//        else
//            System.out.println("java is not fun");
//            System.out.println("orice");

        //MERGE DOAR CU UN SINGUR STATEMENT SUB IF SI ELSE


//THIS IS WORKS
//        int score = 1;
//        if (score == 1)
//            System.out.println("lowest score 1");
//        else if(score == 2)
//            System.out.println("score 2");
//        else if (score == 3)
//            System.out.println("score 3");
//        else
//            System.out.println("invalid score");


        // THIS DOESN'T WORK

//        int score =  1;
//        if( score == 1)
//            System.out.println("orice");
//            System.out.println("altceva");
//        else
//        System.out.println("fail");
//        System.out.println("asa");

//        int a = 2;
//        if (a == 1)
//            System.out.println("a is 1");      nu printeaza pt e in blocul false a lui if
//            System.out.println("1 is a");      asta il printeaza pt ca e independent de blocul if        }
    }

}