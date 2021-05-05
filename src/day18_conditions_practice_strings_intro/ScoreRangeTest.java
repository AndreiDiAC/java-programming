package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int num = 4;
        if (num >=1 && num <=40){
            System.out.println("D");
        }else if ( num > 40 && num <=60){
            System.out.println("C");
        }else if( num >60 && num <= 90){
            System.out.println("B");
        }else if( num > 90 && num <= 100){
            System.out.println("A");
        }else{
            System.out.println("Invalid score");
        }
    }
}
