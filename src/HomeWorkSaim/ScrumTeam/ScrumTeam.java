package HomeWorkSaim.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ScrumTeam {
    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> developersList = new ArrayList<>();
    private boolean hasSprint;
    private boolean hasMeeting;



    public ScrumTeam(String PO, String BA, String SM){  //overloaded with po, ba, sm constructors
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }

    @Override
    public String toString() {
        return "ScrumTeam {" + "\n" +
                "PO='" + PO + '\'' + "\n" +
                ", BA='" + BA + '\'' + "\n" +
                ", SM='" + SM + '\'' + "\n" +
                ", testersList = "+ testersList.size() + " " + testersList + "\n" +
                ", developers = " + developersList.size() + " " + developersList + "\n" +
                ", hasSprint = " + hasSprint + "\n" +
                ", hasMeeting  = " + hasMeeting + "\n" +
                '}';
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
//        for (int i = 0; i < testers.length; i++){
//            testersList.add(testers[i]);
//        }
        this.testersList.addAll(Arrays.asList(testers));

    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        Collections.addAll(developersList,developers);
    }

    public void removeTester(String employeeID){
//        testersList.removeIf(each -> each.getEmployeeID().equals(employeeID));

        for ( int i = 0; i < testersList.size(); i++){
            if(testersList.get(i).getEmployeeID().equals(employeeID)){
                testersList.remove(testersList.get(i--));
            }
        }
    }


    public void removeDeveloper(String employeeID){
        developersList.removeIf(each -> each.getEmployeeID().equals(employeeID));
    }
}
