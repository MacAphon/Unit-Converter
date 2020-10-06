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
			if (mode.equals("temp")) {
				Temp.tempConv();
			}
			else if (mode.equals("end")) {
				System.exit(0);
			}
		}
	}

}
