package day25_loops;

public class WhileHungry {

    public static void main(String[] args) {
        int bananas = 0;
        boolean isHungry = true;
        int countToFull = 3;

//        while (isHungry){
//            bananas++;
//            System.out.println("Eating a banana " + bananas);
////            isHungry = bananas == countToFull ? false : true;
//            if(bananas==countToFull){
//                isHungry =false;
//            }
//        }
//        System.out.println("I am full!");

        while (isHungry && bananas < countToFull) {
            bananas++;
            System.out.println("Eating a banana " + bananas);

        }
        System.out.println("I am full!");
    }
}

