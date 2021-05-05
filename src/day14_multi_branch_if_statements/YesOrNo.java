package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'y';
        boolean answer;
        String result;

        if (selection =='y'){
            System.out.println((answer = true) + " -> Your file will be deleted");
        }else{
            System.out.println((answer = false) + " -> File deletion canceled");
        }
        System.out.println("Did your file get deleted -> " + answer);
    }
}
