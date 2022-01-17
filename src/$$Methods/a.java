package $$Methods;

import java.util.Arrays;
import java.util.TreeSet;

public class a {

   String name;
   int age;
   static String fullName;

   public a(String name, int age){
      this.name = name;
      this.age = age;
   }



   public void walk(){
      System.out.println("aaaa");
   }
   public void talk(){}

   public static void myStatic(){
      System.out.println("from a");
   }

   final void method(){

   }




}

class Teacher extends a implements Banana{


   int teacherID;
   public Teacher(String name, int age, int teacherID) {
      super(name, age);
      this.teacherID = teacherID;
   }


   void talk(int a){

   }

   public void teach(String topic){
      super.walk();
      super.talk();
      super.name = "asd";
   }


   @Override
   public void walk(){
      super.walk();
      System.out.println("asd");
   }

   public static void myStatic(){
      System.out.println("from Teacher");
   }

   final void method(int a){

   }


   @Override
   public void asaceva() {

   }

   @Override
   public void asd() {

   }

   public static int doResearch(){
      System.out.println("coming from teacher");
      return 100;
   }


}



interface Banana{
   public abstract void asaceva();
   default void anything(){
      System.out.println("you can add anything in here");
   }

   public void asd();

   public default int anotherOne(){
      return 1;
   }

   public static int doResearch(){
      System.out.println("coming from Banana");
      return 10;
   }

   public static final boolean STUDY = true;

   int number = 10;

   public static void has(){
      System.out.println("static method");
   }


}

abstract class Apple implements Banana{
   public Apple(){
      System.out.println("constructor from Apple");
   }
}


class Objects{
   public static void main(String[] args) {
      a teacher = new a("Andrei",29);
      teacher.walk();
      a.myStatic();
      Teacher.myStatic();

      Teacher teacher1 = new Teacher("Bogdan",30,11);
      Teacher.myStatic();
      System.out.println(teacher1.name);

      System.out.println("Banana.STUDY = " + Banana.STUDY);
      System.out.println("Banana.number = " + Banana.number);

      teacher1.anotherOne();

      Banana.doResearch();
      Teacher.doResearch();





   }
}

class nonAbstractClass{
      public void nonAbs(){
         System.out.println("nonAbs");
      }
}


abstract class yes{


   public void dada(){
      System.out.println("from yes");
   }
}

class no extends yes implements maybe{
   @Override
   public void dada(){
      System.out.println("from no");
   }


   @Override
   public void maybe(){
      System.out.println("from no");
   }


   public void nonAbs(){

   }

}

interface maybe{

   default void maybe(){
      System.out.println("from maybe");
   }
}

class objects{
   public static void main(String[] args) {
      no no  =  new no();
      no.maybe();


      maybe maybe = new no();
      maybe.maybe();

      yes yes = new no();
      yes.dada();
   }


}