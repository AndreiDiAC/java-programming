package day64_review;

public class EnvRunner {

    public static void setupEnvironment(Environment env){
        switch (env){
            case QA:
                System.out.println("We are in QA env");
                break;
            case DEV:
                System.out.println("We are in DEV env");
                break;
            case PROD:
                System.out.println("Executing tests in PROV environment");
                break;
            case STAGING:
                System.out.println("Executing tests in Staging env");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(Environment.QA);
        System.out.println(Environment.DEV);

        Environment env = Environment.QA;

        System.out.println(env);



    }
}
