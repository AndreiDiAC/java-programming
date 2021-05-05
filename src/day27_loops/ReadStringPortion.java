package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        //             0123456   length(cat,car) = 7; i+3 =cat(012) 3not included;
        String list1 = "cat,car";
        //using substring print first 3 letters
//        int i = 0;
//        System.out.println(list.substring(0,3));
//        System.out.println(list.substring(i,i+3));
//        i++;
//        System.out.println(list.substring(i,i+3));
//        i++;
//        System.out.println(list.substring(i,i+3));
//        System.out.println(list.substring(3,6));
        String list = "cat,car,black cat, red car";
//              4 <=  i <           7-2 => 5
        for(int i = 0;i < list.length()-2;i++){
            System.out.println(list.substring(i,i+3));
            if(list.substring(i,i+3).equals("cat")  || list.substring(i, i+3) == "car"){
                System.out.println("cat or cat found");
            }

            //or

            String part = list.substring(i, i+3);
            if(part.equals("cat") || part.equals("car")){
                System.out.println("car or cat found");
            }
        }
    }
}
