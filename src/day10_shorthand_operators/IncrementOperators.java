package day10_shorthand_operators;

public class IncrementOperators {
    public static void main(String[] args) {
        //3 ways to ad/minus 1 from variable:
        int i = 1;
       //1 num = num + 1;

       //2 num += 1;

       // 3 num++; or ++num;
        i++;
        System.out.println(i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println(i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++; //change to next character
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--;letter--;letter--;
        System.out.println("letter = " + letter);

        char a = 93;
        System.out.println("a = " + a);


    }
}
