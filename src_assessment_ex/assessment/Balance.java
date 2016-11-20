package assessment;



public class Balance implements Comparable<Balance> {

	public Balance(double amount) {
		super();
		this.amount = amount;
	}

	double amount;

	public int compareTo(Balance that) {
		if (this.amount < that.amount - 0.05)
			return -1;
		if (this.amount > that.amount + 0.05)
			return +1;
		return 0;
	}

	public static void main(String[] args) {
		Balance a,b,c;
		
		a=new Balance(1.0);
		b=new Balance(1.03);
		c=new Balance(1.06);
		
		if (a.compareTo(b)==0)
			if (b.compareTo(c)==0)
				if(a.compareTo(c)==0) System.out.println("Transitive");
				else
					System.out.println("NOT Transitive. ABORT. ABORT!!!");

	}

}
