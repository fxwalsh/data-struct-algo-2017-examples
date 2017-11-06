import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RandomGen {

	public static void main(String[] args) {
		Random r = new Random();
		int simRuns = 1000;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter N");

		int N = s.nextInt();
		s.close();
		int count = 0;
		
		for (int i = 0; i < simRuns; i++) {
			Set<Integer> hashSet = new HashSet<>();
			boolean noRepeat = true;
			while (noRepeat)
				noRepeat = hashSet.add(r.nextInt(N));

			count += hashSet.size();

		}

		System.out.println("Num before duplicate:"+ count / simRuns);
		System.out.println("pi*n/2:"+Math.sqrt(Math.PI * N / 2));
	}

}
