/* The temperature conversion class of UnitConverter
 * 
 */
import java.util.Scanner;

public class Temp {
	
	private static double tempCF(double celsius) {
		return celsius * 1.8 + 32;
	}
	
	private static double tempFC(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	private static double tempCK(double celsius) {
		return celsius + 273.15;
	}

	private static double tempKC(double kelvin) {
		return kelvin - 273.15;
	}

	private static double tempFK(double fahrenheit) {
		return (fahrenheit - 32) / 1.8 - 273.15;
	}

	private static double tempKF(double kelvin) {
		return (kelvin - 237.15) * 1.8 + 32;
	}

	public static void tempConv() {
		Scanner input = new Scanner(System.in);
		int submode;
		double temp;
		
		System.out.println("\nSelect conversion mode\n");
		System.out.println("1: Celsius to Fahrenheit");
		System.out.println("2: Fahrenheit to Celsius");
		System.out.println("3: Celsius to Kelvin");
		System.out.println("4: Kelvin to Celsius");
		System.out.println("5: Fahrenheit to Kelvin");
		System.out.println("6: Kelvin to fahrenheit");
				
		submode = input.nextInt();
		
		switch (submode) {
		case (1):
			System.out.println("\nInput temperature in Celsius");
			temp = input.nextDouble();
			System.out.println(tempCF(temp));
			break;
		case (2):
			System.out.println("\nInput temperature in Fahrenheit");
			temp = input.nextDouble();
			System.out.println(tempFC(temp));
			break;
		case (3):
			System.out.println("\nInput temperature in Celsius");
			temp = input.nextDouble();
			System.out.println(tempCK(temp));
			break;
		case (4):
			System.out.println("\nInput temperature in Kelvin");
			temp = input.nextDouble();
			System.out.println(tempKC(temp));
			break;
		case (5):
			System.out.println("\nInput temperature in Fahrenheit");
			temp = input.nextDouble();
			System.out.println(tempFK(temp));
			break;
		case (6):
			System.out.println("\nInput temperature in Kelvin");
			temp = input.nextDouble();
			System.out.println(tempFC(temp));
			break;
		default:
			System.out.println("\nInvalid Input");
		}
	}
}
