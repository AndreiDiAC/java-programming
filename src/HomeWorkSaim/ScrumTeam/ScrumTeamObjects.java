package HomeWorkSaim.ScrumTeam;

public class ScrumTeamObjects {
    public static void main(String[] args) {
//        ScrumTeam team1 = new ScrumTeam("Andrei", "Andreea", "Ionut");
//        System.out.println(team1);
//
//
//
//        Tester testerBogdan = new Tester("Bogdan","BOG123","SDET",110000);
//        Tester testerIon = new Tester("Ion","ION111","ManualTester",80000);
//        Tester testerIoana = new Tester("Ioana","IOA112","QATester",90000);
//
//        System.out.println(testerBogdan);
//
//        team1.addTester(testerBogdan);
//        System.out.println(team1);
//
//        team1.addTesters(new Tester[]{testerIoana,testerIon});
//        System.out.println(team1);
//
//        team1.addDeveloper(new Developer("Grasu","GRS181","developer1",120000,true));
//        System.out.println(team1);
//
//        Developer developer2 = new Developer("Andam","ADA999","developer2",120000,true);
//        Developer developer3 = new Developer("Manuel","MAN876","developer3",123000,true);
//        Developer developer4 = new Developer("Ecaterina","Eca","developer4",130000,true);
//
//        System.out.println(developer2.getName());
//        System.out.println(developer2.getSalary());
//        System.out.println(developer2.getEmployeeID());
//        System.out.println(team1);
//
//        team1.addDevelopers(new Developer[]{developer3,developer4});
//        System.out.println(team1);
//
//        testerBogdan.smokeTesting();
//
//        System.out.println("team1.toString() = " + team1.toString());
//
//        ScrumTeam team2 = new ScrumTeam("Andreea", "Andrei","George");
//        System.out.println(team2);
//
//        testerBogdan.getEmployeeID();
//
//        System.out.println("testerBogdan.getEmployeeID() = " + testerBogdan.getEmployeeID());
//
//
//        System.out.println(team1);
//        team1.removeTester("BOG123");
//        System.out.println(team1);
//
//        team1.removeDeveloper("GRS181");
//        System.out.println(team1);



        ScrumTeam team10 = new ScrumTeam("Bulent","Akrem","Tania");
        System.out.println(team10);

        Tester tester1 = new Tester("Ana","AN111","Sdet",100000);
        System.out.println(tester1);

        team10.addTester(tester1);
        System.out.println(team10);


        Tester tester2 = new Tester("Alin", "Al222", "Sdet",900000);
        Tester tester3 = new Tester("Gog","g233","QA",2999999);


        team10.addTesters(new Tester[] {tester2,tester3});
        System.out.println(team10);

        System.out.println("tester2.getName() = " + tester2.getName());


    }
}
