package $OOP.$Collections;

import java.util.*;

public class ListIteratorClass {
    public static void main(String[] args) {

        List<Double> list =
                new LinkedList<>(Arrays.asList(12.0,2.0,12D,111D,876d));

        System.out.println(list);

        ListIterator<Double> lstIter = list.listIterator();

        while (lstIter.hasNext()){
            System.out.println("index " +lstIter.nextIndex() + " - value " + lstIter.next());

        }

//        while (iterList.hasNext()){
//            Double item = iterList.next();
//
//            System.out.println("index " +iterList.nextIndex() + " - value " + item);
//
//            if( item < 10){
//                iterList.remove();
//            }
//        }
//        System.out.println(list);


        System.out.println( "iterList.hasPrevious() - "  + lstIter.hasPrevious());
        System.out.println("iterList.next() - " + lstIter.previous() );

        System.out.println(lstIter.previousIndex());
        System.out.println(lstIter.nextIndex());
        System.out.println(lstIter.next());


        while (lstIter.hasPrevious()){
            System.out.print("index - " + lstIter.previousIndex());
            Double each = lstIter.previous();
            System.out.println( " : value - " + each );

            if(each < 20){
//                lstIter.remove();
//                lstIter.set(200D);
                lstIter.add(1000D);    // add before each position index
            }
        }

        System.out.println(list);





    }
}
