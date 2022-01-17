package day60_exceptions;

public class TrowingException {
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
//        RuntimeException runtimeException = new RuntimeException();
//        throw runtimeException;
        //or
//        throw new RuntimeException();

        String userName = "";
        if(userName.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
            //Assert.fail("reason message...");
        }

    }
}
