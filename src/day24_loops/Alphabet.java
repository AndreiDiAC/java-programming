package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'A';
        while (letter <= 'Z'){
            System.out.print(letter + " ");
            System.out.println();
            letter++;
        }


        int num =10;
        while(num <=20){
            if(num == 15){
                System.out.println("muci");
            }else{
                System.out.print(num + " ");;
            }
            num ++;
        }
        System.out.print(num);


    }
}
