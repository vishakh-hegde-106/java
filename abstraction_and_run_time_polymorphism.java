package java3;

import java.util.Scanner;


abstract class Printer {
    abstract void configuration();
    abstract void display();
}


class DotMatrix extends Printer {
	
	@Override
    void configuration() {
        System.out.println("Dot-Matrix Printer: 9-pin print head, low resolution");
    }
	
	@Override
    void display() {
        System.out.println("Printing in progress...");
    }
}

class LaserJet extends Printer {
    void configuration() {
        System.out.println("LaserJet Printer: Laser technology, high resolution");
    }

    void display() {
        System.out.println("Printing in progress...");
    }
}
public class abstraction {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);

	        while (true) {
	            System.out.println("Select a printer:");
	            System.out.println("1. Dot-Matrix Printer");
	            System.out.println("2. LaserJet Printer");
	            System.out.println("3. Exit");

	            int choice = s.nextInt();

	            switch (choice) {
	                case 1:
	                    Printer dotMatrixPrinter = new DotMatrix();
	                    dotMatrixPrinter.configuration();
	                    dotMatrixPrinter.display();
	                    break;

	                case 2:
	                    Printer laserjetPrinter = new LaserJet();
	                    laserjetPrinter.configuration();
	                    laserjetPrinter.display();
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    s.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }

	}

}
