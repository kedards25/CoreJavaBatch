public class VelocityDemo{

	public static void main(String[] args) {
		int initialVelocity,time;
		double velocity;
		
		initialVelocity=Integer.parseInt(args[0]);
		time=Integer.parseInt(args[1]);
		velocity=initialVelocity+(9.8*time);
		System.out.println("Velocity: "+velocity);

	}

}