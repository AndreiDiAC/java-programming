package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student = new String[5];
        student[0] = "1234";
        student[1] = "Andrei";
        student[2] = "Diaconu";
        student[3] = "22";
        student[4] = "1234567890";

// you can write it on both 2 ways

        String[] student1 = {"1234","Andrei","Diaconu","22","1234567890"};
        System.out.println("id = " + student1[0]);
        System.out.println("first name = " + student1[1]);
        System.out.println("last name = " + student1[2]);
        System.out.println("batch = " + student1[3]);
        System.out.println("phone num = " + student1[4]);
        System.out.println("student data length: " + student1.length);

        if(student1.length == 5){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        if(student1.length == student.length){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }


        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum);

        for ( int i = 0; i < student1.length; i++){
            System.out.println(student1[i]);
        }

        int[] nums = {33,11,66};

        for(int each : nums){
            System.out.println(each);
        }




    }
}
