package AleMele_month$$;

public class SMSmessage {
    public static void main(String[] args) {
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        String sender = message.substring(message.indexOf("<") +1, message.indexOf(">"));
        System.out.println("Sender: " + sender);

        String phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
        System.out.println("Phone number: " + phoneNumber);

        String messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("Message body: " + messageBody);
    }
}
