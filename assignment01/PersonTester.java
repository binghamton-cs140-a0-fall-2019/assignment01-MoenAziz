package assignment01;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester {
	
	public static void main (String[] args) {
		
		var placeOne = new StreetUSAddress("246 74th st", "", "Manhattan", "NY", "11209");
		var placeAndDob = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
		var guy = new Person("Moen", "Aziz", "123456789", placeAndDob, placeOne);
		
		System.out.println(guy);
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		var placeOne2 = new StreetUSAddress("246 74th st", "", "Manhattan", "NY", "11209");
		var placeAndDob2 = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
		var guy2 = new Person("Moen", "Aziz", "123456789", placeAndDob2, placeOne2);
		
		output.println(guy2);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	}
	
}