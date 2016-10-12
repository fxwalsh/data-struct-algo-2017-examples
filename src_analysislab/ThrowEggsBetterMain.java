
/**
 * @author FXWALSH
 * 
 *         Simulates throwing eggs problem from Algorithms analysis lab.
 *         Building modeled as the String array argument of the main
 *         method(args). Example as follows: args = {"o","o","o","b","b","b"}
 *         represents a 6 story building where eggs begin to break on 3th floor,
 *         F=3. Ground floor is a[0].
 *         Uses ground up approach to improve efficiency. 
 *
 */
public class ThrowEggsBetterMain {

	public static void main(String[] args) {
		int n = args.length;
		int lower = 0;
		int upper = n;
		double i = 1.0;

		// Find upper bound from floor by increasing by power of 2;
		upper = new Double(Math.pow(2.0, i)).intValue();

		while (args[upper].equals("o")) {
			lower = upper;
			upper = new Double(Math.pow(2.0, ++i)).intValue();
		}

		// F lies between 2^i-1 and 2^i
		while (upper - lower > 1) {
			int pos = (upper - lower) / 2 + lower;
			if (args[pos].equals("b"))
				upper = pos;
			else
				lower = pos;
		}

		System.out.println(lower);

	}

}
