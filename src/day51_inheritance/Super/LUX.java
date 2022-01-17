package day51_inheritance.Super;

public class LUX extends Lyft{
    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) * 1.2;

    }


}
