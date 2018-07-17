import java.util.Scanner;

public class DetailGenerator {

	// calculate area
	public static double area(double length, double width) {
		double a = length * width;
		return a;
	}

	// calculate perimeter
	public static double perimeter(double length, double width) {
		double p = 2 * (length + width);
		return p;
	}

	// calculate volume if height is greater than 0
	public static double volume(double length, double width, double height) {
		double v = length * width * height;
		return v;
	}

	// prompt for user input and output results
	public static void getInputs() {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter the length of the room: ");
		double length = scnr.nextDouble();

		System.out.println("Enter the width of the room: ");
		double width = scnr.nextDouble();

		System.out.println("Enter the height of the room, if known: ");
		double height = scnr.nextDouble();

		System.out.println("Area: " + area(length, width));
		System.out.println("Perimeter: " + perimeter(length, width));
		if (height > 0) {
			System.out.println("Volume: " + volume(length, width, height));
		}
		another();
		scnr.close();
	}

	// handle looping behavior to continue with new room dimensions
	public static void another() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Continue? (y/n): ");
		String answer = scnr.next();
		if (answer.equals("y")) {
			getInputs();
			}
		scnr.close();
		}

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		getInputs();

	}
}
