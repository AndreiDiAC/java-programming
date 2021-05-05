package AleMele_;

public class ExamplesIf {
    public static void main(String[] args) {
        int a = 10;// 9/8
        int b = a-- * 2 - --a % 2 +a;
        //      10 * 2  -  8 % 2 + 8;
        //      20      -  0     + 8;
        //      28
        if (b % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println(-2 % 7);//-2
    }
}
