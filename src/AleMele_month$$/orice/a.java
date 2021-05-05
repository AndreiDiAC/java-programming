package AleMele_month$$.orice;

public class a {
    public static void main(String[] args) {
    int num = 50;


    for(int i = 2; i < num; i++){
        int count = 0;
        for(int f = 1; f < i;i++ ){
            if(i % 2==0){
                count++;
            }
        }
        if(count == 2){
            System.out.print(i+ " ");
        }
    }
    }
}
