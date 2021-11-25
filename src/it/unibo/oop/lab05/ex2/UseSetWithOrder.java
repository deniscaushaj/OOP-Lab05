package it.unibo.oop.lab05.ex2;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */
public final class UseSetWithOrder{

    private static final int RANDOM = 100;
    private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        final Set<String> ts = new TreeSet<>();
        
        for(int i = 0; i < RANDOM; i++) {
            ts.add(Double.toString(Math.random()));
        }
        
        System.out.println(ts);
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    }
}
