package day36_methodes_with_return;

public class LoginPage {
    public static void main(String[] args) {
        checkEligible(710);
//        System.out.println(checkEligible();); //ERROR - can not print void method
        System.out.println(getCrediScor());
        System.out.println("CreditScore = " + getCrediScor());
        int score = getCrediScor();
        System.out.println("score = " + score);

    }

    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("eligible to buy");
        }else{
            System.out.println("sorry!");
        }

    }


    public static int getCrediScor(){
        return 800;
    }
}
