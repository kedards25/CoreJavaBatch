public class SimpleInterest{

	public static void main(String[] args) {
		int p,n,r;
		double si;
		
		p=Integer.parseInt(args[0]);
		n=Integer.parseInt(args[1]);
		r=Integer.parseInt(args[2]);
		si=(p*n*r)/100;
		System.out.println("Simple Interest: "+si);


	}

}