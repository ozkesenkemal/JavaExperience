import java.util.Scanner;

import Math.FourTrnx;
import Math.Logoritm;

public class MainPackage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter name:");
		//String name = scanner.nextLine();
		//System.out.println("Hello "+ name);
		
		FourTrnx math = new FourTrnx();
		System.out.println(math.add(2,3));
		System.out.println(math.divide(2,3));
		System.out.println(math.substract(2,3));
		System.out.println(math.multiply(2,3));
		Logoritm log = new Logoritm();
		log.someFunct();
	}
}
