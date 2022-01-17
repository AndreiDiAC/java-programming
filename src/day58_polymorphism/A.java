package day58_polymorphism;

public class A {
    public void m1(){
        //code
    }
}


interface I{
    public abstract void m2();
}


class B  extends A implements I{
    public void m2(){
        //code
    }
    public void m3(){
        //code
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1();
        b.m2();
        b.m3();
        A var1 = new B();
        var1.m1();


    }
}

