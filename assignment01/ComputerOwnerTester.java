package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
	
	public static void main(String[] args) {
		
		var placeOne = new StreetUSAddress("246 74th st", "", "Manhattan", "NY", "11209");
		var placeAndDob = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
		var guy = new Person("Moen", "Aziz", "123456789", placeAndDob, placeOne);
		
		var techGuy = new ComputerOwner(guy);
		
		techGuy.addComputer(new Computer("Dell", "Intel 7700k", 8, 3000, true, 1400.00));
		techGuy.addComputer(new Computer("ASUS", "Intel 8700k", 16, 300, false, 700.00));
		techGuy.addComputer(new Computer("Samsung", "Intel 4700k", 12, 5000, true, 900.00));
		techGuy.addComputer(new Computer("Acer", "Intel 3700k", 32, 200, false, 500.00));
		
		System.out.println(techGuy);
		System.out.println();
		
		techGuy.removeComputer(0);
		techGuy.removeComputer(2);

		System.out.println(techGuy);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
			var placeOne2 = new StreetUSAddress("246 74th st", "", "Manhattan", "NY", "11209");
			var placeAndDob2 = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
			var guy2 = new Person("Moen", "Aziz", "123456789", placeAndDob2, placeOne2);
		
			var techGuy2 = new ComputerOwner(guy2);
		
			techGuy2.addComputer(new Computer("Dell", "Intel 7700k", 8, 3000, true, 1400.00));
			techGuy2.addComputer(new Computer("ASUS", "Intel 8700k", 16, 300, false, 700.00));
			techGuy2.addComputer(new Computer("Samsung", "Intel 4700k", 12, 5000, true, 900.00));
			techGuy2.addComputer(new Computer("Acer", "Intel 3700k", 32, 200, false, 500.00));
		
			output.println(techGuy2);
			output.println();
		
			techGuy2.removeComputer(0);
			techGuy2.removeComputer(2);

			output.println(techGuy2);
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	}
	
	
	
	
}