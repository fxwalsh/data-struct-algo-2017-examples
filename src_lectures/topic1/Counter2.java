package topic1;

import java.util.Arrays;
import java.util.Random;


/******************************************************************************
 *  Compilation:  javac Counter.java
 *  Execution:    java Counter n trials
 *  Dependencies: StdRandom.java StdOut.java
 *
 *  A mutable data type for an integer counter.
 *
 *  The test clients create n counters and performs trials increment
 *  operations on random counters.
 *
 * java Counter 6 600000
 *  100140 counter0
 *  100273 counter1
 *  99848 counter2
 *  100129 counter3
 *  99973 counter4
 *  99637 counter5
 *
 ******************************************************************************/

/**
 *  The {@code Counter} class is a mutable data type to encapsulate a counter.
 *  <p>
 *  For additional documentation,
 *  see <a href="http://algs4.cs.princeton.edu/12oop">Section 1.2</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 *  @author FXWALSH
 */
public class Counter2 implements Comparable<Counter2>{

    private final String name;     // counter name
    private int count = 0;         // current value

    /**
     * Initializes a new counter starting at 0, with the given id.
     *
     * @param id the name of the counter
     */
    public Counter2(String id) {
        name = id;
    } 

    /**
     * Increments the counter by 1.
     */
    public void increment() {
        count++;
    } 

    /**
     * Returns the current value of this counter.
     *
     * @return the current value of this counter
     */
    public int tally() {
        return count;
    } 

    /**
     * Returns a string representation of this counter.
     *
     * @return a string representation of this counter
     */
    public String toString() {
        return count + " " + name;
    } 



    /**
     * Reads two command-line integers n and trials; creates n counters;
     * increments trials counters at random; and prints results.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) { 
        int n = 10;
        int trials = 6000;
        Random rn = new Random();
       
        // create n counters
        Counter2[] hits = new Counter2[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter2("counter" + i);
        }

        // increment trials counters at random
        for (int t = 0; t < trials; t++) {
            hits[rn.nextInt(n)].increment();
        }

        // print results
        for (int i = 0; i < n; i++) {
            System.out.println(hits[i]);
        }
        
        Arrays.sort(hits);
        System.out.println();
        // print results
        for (int i = 0; i < n; i++) {
            System.out.println(hits[i]);
        }
    }

	@Override
	public int compareTo(Counter2 that) {
		 if      (this.count < that.count) return -1;
	     else if (this.count > that.count) return +1;
	     else                              return  0;
	} 
} 