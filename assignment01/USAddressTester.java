package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	
	public static void main (String[] args) {
		
	var placeOne = new StreetUSAddress("246 74th st", "", "Brooklyn", "NY", "11209");
	var placeTwo = new StreetUSAddress("4400 Vestal Pkwy E", "PO Box 134", "Binghamton", "NY", "13902");
	
	System.out.println(placeOne);
	System.out.println();
	System.out.println(placeTwo);
	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		var placeOne2 = new StreetUSAddress("246 74th st", "", "Brooklyn", "NY", "11209");
		var placeTwo2 = new StreetUSAddress("4400 Vestal Pkwy E", "PO Box 134", "Binghamton", "NY", "13902");
	
		output.println(placeOne2);
		output.println();
		output.println(placeTwo2);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}