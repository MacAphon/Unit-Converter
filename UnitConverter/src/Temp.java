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
		
		System.out.println("\nSelect conversion mode\n\n1: Celsius to Fahrenheit\n2: Fahrenheit to Celsius");
		System.out.println("3: Celsius to Kelvin\n4: Kelvin to Celsius\n5: Fahrenheit to Kelvin\n6: Kelvin to fahrenheit");
		
		submode = input.nextInt();
		
		if (submode == 1) {
			System.out.println("\nInput temperature in Celsius");
			temp = input.nextDouble();
			System.out.println(tempCF(temp));
		} else if (submode == 2) {
			System.out.println("\nInput temperature in Fahrenheit");
			temp = input.nextDouble();
			System.out.println(tempFC(temp));
		} else if (submode == 3) {
			System.out.println("\nInput temperature in Celsius");
			temp = input.nextDouble();
			System.out.println(tempCK(temp));
		} else if (submode == 4) {
			System.out.println("\nInput temperature in Kelvin");
			temp = input.nextDouble();
			System.out.println(tempKC(temp));
		} else if (submode == 5) {
			System.out.println("\nInput temperature in Fahrenheit");
			temp = input.nextDouble();
			System.out.println(tempFK(temp));
		} else if (submode == 6) {
			System.out.println("\nInput temperature in Kelvin");
			temp = input.nextDouble();
			System.out.println(tempFC(temp));
		} else {
			System.out.println("\nInvalid Input");
		}
	}
}
