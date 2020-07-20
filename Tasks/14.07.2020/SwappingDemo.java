public class SwappingDemo{

	public static void main(String[] args) {
		int a,b,temp;
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Values before swapping: "+a+" and "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("Values after swapping: "+a+" and "+b);

	}

}