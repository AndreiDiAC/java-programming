package day04_variable_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        // int static = 22; -> error, static sis reserved by java
        int statitc2 = 22;
        int _static = 22;
        int $$tatic = 24;
        int staticVar =55;

        int salary$ =55;
        //int 1stMonthSalary =3000; -> error
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work finem but not recommended
        //we shoud use meaninful variable names
        // number-of-fried = 400;
        int numberOfFriends = 401;
        int number_of_friends = 401; // not convention

    }
}
