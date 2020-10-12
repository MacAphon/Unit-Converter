
/* A program to convert temperature units.
 * Other types of units will be added later.
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mode;

		while (true) {
			System.out.println("\nSelect Mode\n");
			System.out.println("temp:     Temperature");
			System.out.println("angle:    Angles");
			System.out.println("\ntype end to close the program");

			mode = input.nextLine();

			while (true) {
				switch (mode) {
				case ("temp"):
					Temp.tempConv();
					break;
				case ("angle"):
					Angle.angconv();
					break;
				case ("end"):
					System.exit(0);
					break;
				default:
					System.out.println("\nInvalid Input");
				}
			}
		}
	}
}
