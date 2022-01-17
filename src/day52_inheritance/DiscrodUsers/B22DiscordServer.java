package day52_inheritance.DiscrodUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("sutdent");

        Admin admin1 = new Admin();
        admin1.setId(43145);
        admin1.setName("Burak");
        admin1.setRole("admin");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Giulia", 123);
        System.out.println(admin2.toString());

    }
}
