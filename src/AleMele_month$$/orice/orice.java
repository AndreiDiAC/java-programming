package AleMele_month$$.orice;


    public class orice{
        public static void main(String[] args){
            String str = "breadjam";
            int firstBread = str.indexOf("bread");
            int lastBread = str.lastIndexOf("bread");
            if(firstBread != lastBread){
                System.out.println(str.substring(firstBread + 5, lastBread));
            }else{
                System.out.println("nothing");
            }
        }



        }



