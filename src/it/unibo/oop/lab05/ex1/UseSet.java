package it.unibo.oop.lab05.ex1;

//import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//import java.util.stream.Collectors;

//import javax.lang.model.element.Element;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
    
    private static final int ELEM = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
            
        final Set<String> ts = new TreeSet<>();
        
        for(int i = 1; i<= ELEM; i++) {
            ts.add(Integer.toString(i));
        }
        
        System.out.println(ts);
        
        final var x = ts.iterator();
        
        while(x.hasNext()) {
            if(Integer.parseInt(x.next()) % 3 == 0) {
                x.remove();
            }
        }
        
        for (String string : ts) {
            System.out.println(Integer.parseInt(string));
        }
        
        /*
        My solution before looking at the teacher's solution
        final Set<String> ts2 = ts;
        final var y = ts2.iterator();
        
        while(y.hasNext()) {
            if(Integer.parseInt(y.next()) % 2 != 0) {
                System.out.println("Not all the numbers in the set are even");
                return;
            }
        }*/
        
        final Set<String> ts2 = new TreeSet<>();
        
        for (int i = 2; i <= ELEM; i+=2) {
            ts2.add(Integer.toString(i));
        }
        System.out.println(ts2);
        System.out.println(ts2.containsAll(ts));
        /*
        ts.stream().filter(e -> Integer.parseInt(e) % 3 != 0).collect(Collectors.toSet());
        System.out.println(ts.stream().filter(e -> Integer.parseInt(e) % 3 != 0).collect(Collectors.toSet()));
        */
        
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         * 
         * 3) Prints its content
         * 
         * 4) Removes all those strings whose represented number is divisible by
         * three
         * 
         * 5) Prints the content of the Set using a for-each costruct
         * 
         * 6) Verifies if all the numbers left in the set are even
         */
    }
}
