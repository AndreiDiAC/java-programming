package AleMele_month$$;

/**
 Given a String variable with a message.
 You will check if the message contains any of these bad words: “idiot, dumb, heck”
 -> If the message contains any of those words print: “Message not sent”.
 -> If the message is bad word free print “Message sent”

 */
public class BadWords {
    public static void main(String[] args) {
        String message = "orece vrei tu sa auzi idiotule";
        if(message.contains("idiot") || message.contains("dumb") || message.contains("keck")){
            System.out.println("Message not sent");
        }else{
            System.out.println("Message sent");
        }
    }
}
