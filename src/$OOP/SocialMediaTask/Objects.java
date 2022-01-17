package $OOP.SocialMediaTask;

import java.time.LocalTime;

public class Objects {
    public static void main(String[] args) {
        Facebook Andrei = new Facebook("Andrei", "andreiasd");
        System.out.println(Andrei.getPassword());

        Facebook facebook1 = new Facebook("Andrei","asd","Andrei@");
        System.out.println(facebook1.getFullName());

        Facebook facebook2 = new Facebook("Andreea","asd","AndreeaDruga",20,100);
        System.out.println(facebook2.getAge());
        facebook2.post("anything");
        facebook2.post("asd");
        System.out.println(facebook2);

        System.out.println(LocalTime.now().getHour());

        System.out.println(facebook2);
        facebook2.sendFriendRequest(Andrei);
        System.out.println(facebook2);
        System.out.println(Andrei);

        facebook2.joinGroup("banana");
        System.out.println(facebook2.getCountGroups());

        Instagram a = new Instagram("Kate","123");

        Facebook face = new Facebook("And","asd");

        System.out.println(a.personalUrl);
        System.out.println(face.personalUrl);

        a.Notifications();

    }
}
