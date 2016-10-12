
public class ThrowEggsMain {

	public static void main(String[] args) {
		int n=args.length;	
		int lower = 0;
		int upper = n-1;
		
		
		while(upper-lower>1){
			int pos = (upper-lower)/2 + lower;
			if (args[pos].equals("b"))
				upper = pos;
			else
				lower=pos;	
		}
		
		
		System.out.println(lower);
		
				

	}

}
