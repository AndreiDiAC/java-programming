package Jobs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindCompany {

    public static void main(String[] args) {

        List<Job> jobs = new ArrayList<>();


        Job coforge = new Job();
        coforge.setCompanyName("Coforge");
        coforge.setState("Chicago");
        jobs.add(coforge);

        Job ZillionTechnologies = new Job();
        ZillionTechnologies.setCompanyName("Zillion Technologies");
        ZillionTechnologies.setRemote("100%");
        ZillionTechnologies.setPosition("7123626");
        ZillionTechnologies.setState("Texas, Dallas");

        jobs.add(ZillionTechnologies);


        Job JeffersonFrank = new Job();
        JeffersonFrank.setCompanyName("Jefferson Frank");
        JeffersonFrank.setJobId("NCSDETID-84");
        JeffersonFrank.setPosition("full time");
        JeffersonFrank.setState("");
        JeffersonFrank.setPosition("SDET");
        JeffersonFrank.setDescription("my first call");

        jobs.add(JeffersonFrank);

        Job AdroitSoftware = new Job();
        AdroitSoftware.setCompanyName("Adroit Software");
        AdroitSoftware.setPosition("contractor");
        AdroitSoftware.setJobTitle("SET");
        AdroitSoftware.setJobId("165863");
        AdroitSoftware.setState("TX");
        AdroitSoftware.setDescription("got call from Sandeep");

        jobs.add(AdroitSoftware);


        Job ComputerEnterprises = new Job();
        ComputerEnterprises.setCompanyName("Computer Enterprises");
        ComputerEnterprises.setState("DC");
        ComputerEnterprises.setJobId("");
        ComputerEnterprises.setRecruiter("Christine Bustamante");
        ComputerEnterprises.setPosition("contract w2");
        ComputerEnterprises.setJobId("CBBH12956");

        jobs.add(ComputerEnterprises);

        Job TechnologyNavigators = new Job();
        TechnologyNavigators.setCompanyName("Technology Navigators");
        TechnologyNavigators.setJobId("5061BHreroll");
        TechnologyNavigators.setRemote("yes");
        TechnologyNavigators.setState("Arizona, Phoenix");
        TechnologyNavigators.setPosition("full time");

        jobs.add(TechnologyNavigators);

        Job EliassenGroup = new Job();
        EliassenGroup.setCompanyName("Eliassen Group");
        EliassenGroup.setRemote("yes");
        EliassenGroup.setPosition("contractor w2");
        EliassenGroup.setState("Burlington, NC");
        EliassenGroup.setJobId("354731");

        jobs.add(EliassenGroup);

        Job ClifyX = new Job();
        ClifyX.setCompanyName("ClifyX");
        ClifyX.setJobId("ASF45");
        ClifyX.setPosition("contract w2");
        ClifyX.setRemote("yes");
        ClifyX.setState("Tampa, Boston");

        jobs.add(ClifyX);


        Job MotionRecruitment = new Job();
        MotionRecruitment.setCompanyName("Motion Recruitment");
        MotionRecruitment.setPosition("fulltime");
        MotionRecruitment.setJobId("466487");
        MotionRecruitment.setState("Warrenville, IL");

        jobs.add(MotionRecruitment);

        Job VacoTechnology = new Job();
        VacoTechnology.setCompanyName("Vaco Technology");
        VacoTechnology.setJobId("REMOT24466-700");
        VacoTechnology.setPosition("full time");

        jobs.add(VacoTechnology);

        Job Grubhub = new Job();
        Grubhub.setCompanyName("Grubhub");
        Grubhub.setState("Chicago");
        Grubhub.setJobId("2021-11103");

        jobs.add(Grubhub);

        Job Kforce = new Job();
        Kforce.setCompanyName("Kforce");
        Kforce.setJobId("ITAQG1976705");
        Kforce.setState("North Carolina");

        jobs.add(Kforce);

        Job RobertHalf = new Job();
        RobertHalf.setCompanyName("Robert Half");
        RobertHalf.setJobId("01300-0011950462");
        RobertHalf.setState("IL");
        RobertHalf.setPosition("full time");

        jobs.add(RobertHalf);

        Job InfotechResources =  new Job();
        InfotechResources.setPosition("remote");
        InfotechResources.setCompanyName("Infotech Resources");
        InfotechResources.setJobId("11759");

        jobs.add(InfotechResources);

        Job SparInformationSystems = new Job();
        SparInformationSystems.setCompanyName("Spar Information Systems");
        SparInformationSystems.setState("");


        Job SignatureConsultants = new Job();
        SignatureConsultants.setCompanyName("Signature Consultants");
        SignatureConsultants.setState("Haperville, GA");
        SignatureConsultants.setJobId("344165-527");

        jobs.add(SignatureConsultants);

        Job BountyJobs =  new Job();
        BountyJobs.setCompanyName("BountyJobs");
        BountyJobs.setPosition("full time");
        BountyJobs.setJobId("15179_SDG-471065");

        jobs.add(BountyJobs);

        Job Experis = new Job();
        Experis.setCompanyName("Experis");
        Experis.setJobId("BBBH49360-671");

        jobs.add(Experis);

        Job Kelly = new Job();
        Kelly.setCompanyName("Kelly");
        Kelly.setJobId("US145ZSP_BH3641927");

        jobs.add(Kelly);

        Job GlobalFoundries = new Job();
        GlobalFoundries.setCompanyName("GlobalFoundries");
        GlobalFoundries.setState("Essex, VT");

        jobs.add(GlobalFoundries);


        Job TCS = new Job();
        TCS.setCompanyName("TATA Consultancy Services");
        TCS.setState("Tx");
        TCS.setDescription("15 Sept, 3PM interview");

        jobs.add(TCS);

        Job Equifax = new Job();
        Equifax.setCompanyName("Equifax");
        Equifax.setDescription("got interview for St. Luis");
        jobs.add(Equifax);

        Job GSSInfotech = new Job();
        GSSInfotech.setCompanyName("GSS Infotech");
        GSSInfotech.setPosition("7125449");
        jobs.add(GSSInfotech);

        Job MotionRecruitment2 = new Job();
        MotionRecruitment2.setCompanyName("Motion Recruitment");
        MotionRecruitment2.setJobId("477255");
        jobs.add(MotionRecruitment2);

        for (int i = 0; i < jobs.size(); i++) {
            System.out.println(jobs.get(i).getCompanyName());

        }

        System.out.println(jobs.size());



        StringBuilder st =  new StringBuilder("asd");
        System.out.println("st.reverse() = " + st.reverse());


    }


}
