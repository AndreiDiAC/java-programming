package AleMele_;

/*
Given a sport you play at the community center you will have to pay some enterance fee.

    Soccer or Tennis fee is: 100
    Otherwise fee is: 50

 */
public class Sport {
    public static void main(String[] args) {
        boolean Soccer = false;
        boolean Tennis = false;
        int x = Soccer || Tennis ? 100 : 50;
        System.out.println(x);
    }

}
