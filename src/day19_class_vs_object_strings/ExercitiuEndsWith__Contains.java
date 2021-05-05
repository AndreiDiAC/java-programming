package day19_class_vs_object_strings;

public class ExercitiuEndsWith__Contains {
    public static void main(String[] args) {
        String web = "www.go.com";
        if(web.endsWith(".com")){
            System.out.println("Commercial website");
        }else if (web.endsWith(".ru")){
            System.out.println("Russian website");
        }else if (web.endsWith("gov")){
            System.out.println("Government website");
        }else if(web.endsWith("edu")){
            System.out.println("Education website");
        }else if(web.endsWith(".org")){
            System.out.println("Organization website");
        }


        String a = "anything";
        System.out.println(a.contains("thi"));

        // nu merge sa pui litere la intamplare din string

    }
}
