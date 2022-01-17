package day51_inheritance.Super;

public class LyftXL extends Lyft{
    @Override
    public double calculateRate(double miles) {

        return super.calculateRate(miles) * 1.1;
    }
}
