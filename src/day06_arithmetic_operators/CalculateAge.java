package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args) {
        int yearOfBirth, currenYear, age;

        yearOfBirth = 1984;
        currenYear = 2021;
        age = currenYear - yearOfBirth;
        System.out.println("He is " + age + " years old." );
    }
}
