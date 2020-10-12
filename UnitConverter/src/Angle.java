/* The angle conversion class of UnitConverter
 * 
 */
import java.util.Scanner;

public class Angle {
	private static double dDegRad(double dDeg) {
		return (dDeg * Math.PI /180);
	}
	private static double radDDeg(double rad) {
		return (rad * 180 / Math.PI);
	}

	public static void angconv() {
		Scanner input = new Scanner(System.in);
		int submode;
		double angle;
		
		System.out.println("\nSelect conversion mode\n");
		System.out.println("1: Degrees to Radians");
		System.out.println("2: Radians to Degrees");
		
		submode = input.nextInt();
		
		switch (submode) {
		case (1):
			System.out.println("\nInput angle in Degrees");
			angle = input.nextDouble();
			System.out.println(dDegRad(angle));
			break;
		case (2):
			System.out.println("\nInput angle in Radians");
			angle = input.nextDouble();
			System.out.println(radDDeg(angle));
			break;
		default:
			System.out.println("\nInvalid Input");
		}
	}

}
