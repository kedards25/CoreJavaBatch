public class MoonWeightDemo{

	public static void main(String[] args) {
		int weight_earth;
		double weight_moon;
		
		weight_earth=Integer.parseInt(args[0]);
		System.out.println("Weight on earth: "+weight_earth);
		weight_moon=weight_earth*1.6*9.8;
		System.out.println("Weight on moon: "+weight_moon);

	}

}