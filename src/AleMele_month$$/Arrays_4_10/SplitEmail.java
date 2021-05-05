package AleMele_month$$.Arrays_4_10;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "info@cybertekschool.com";
        int count = 0;
        for (int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                count++;
            }
        }

        if(count == 1){
            String[] emailArr = email.split("@");
            System.out.println("Email id: " + emailArr[0]);
            System.out.println("Email domain: " + emailArr[1]);
        }else{
            System.out.println("invalid email");
        }



    }
}
