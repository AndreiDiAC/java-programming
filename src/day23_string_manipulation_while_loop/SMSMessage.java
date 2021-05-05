package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message  = "sender: [Nadir] from number <2223334444> Message:{hello, lets code some java}";
        System.out.println("Sender: " + message.substring(message.indexOf("[")+1,message.indexOf("]") ));
        System.out.println("Number: " + message.substring(message.indexOf("<")+1, message.indexOf(">")));
        System.out.println("Message: " + message.substring(message.indexOf("{")+1, message.indexOf("}")));


//        int start = message.indexOf("[");
//        int end = message.indexOf("]");
//        System.out.println(message.substring(start+1,end));
//        String sender = message.substring(start+1, end);
//        System.out.println("sender = " + sender);
        System.out.println("    \n \tAndrei    ".trim()); //no space on the borders
        String word = " s q l ";
        System.out.println(word.replace(" ",""));
        System.out.println(word.toUpperCase().replace(" ", "|").equals("|S|Q|L|"));



    }
}
