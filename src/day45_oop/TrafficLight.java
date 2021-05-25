package day45_oop;

public class TrafficLight {
    String color;

    public void showColor(){
        System.out.println("current color = " + color);
    }


    public void changeColor(String newColor){
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow")
            || newColor.equalsIgnoreCase("green")){
            System.out.println("changing color to " + newColor);
            color = newColor;
        } else {
            System.out.println("ERROR: invalid color: " + newColor);
        }


    }
}

class TrafficLightObject{
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";  NOT THIS WAY TODAY

        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); DIRECT access to variable. NOT RECOMMENDED

        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("blue");
        trafficLight1.showColor();
    }
}
