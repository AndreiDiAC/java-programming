package day32_arrays_split;

import java.util.Arrays;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zone = "us_east-1,us-west-2,us-west-1";
        String[] zoneArray = zone.split(",");
        int comaSplit = zoneArray.length -1;

        System.out.println(Arrays.toString(zoneArray));
        System.out.println(comaSplit);
        System.out.println();

        for(String each: zoneArray){
            System.out.println(each);
        }
        for(String each:zoneArray){
            System.out.println("Deploying etsy to " + each);
            System.out.println("Deployment completed for " + each);
        }
        System.out.println("---All deployment completed-----");


        //or
//        for(int i = 0; i < zoneArray.length;i++){
//            System.out.println("Deploying etsy to " + zoneArray[i]);
//            System.out.println("Deployment completed for " + zoneArray[i]);
//        }
//        System.out.println("---All deployment completed-----");

    }
}
