package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester {
	
	public static void main(String[] args) {
		
		SimpleDate dateOne = new SimpleDate();
		dateOne = SimpleDate.of(2010, 12, 27);
		
		SimpleDate dateTwo = new SimpleDate();
		dateTwo = SimpleDate.of(2009, 7, 18);
		
		
		if (dateOne.before(dateTwo)) {
			
		System.out.println("Date one is before Date two");
		
		} else {
			System.out.println("Date one is not before Date two");
			
			
		}
		System.out.println();
		
		dateOne = SimpleDate.of(1999, 3, 6);
		dateTwo = SimpleDate.of(2006, 8, 7);
		
		if (dateOne.before(dateTwo)) {
			
		System.out.println("Date one is before Date two");
		
		} else {
			System.out.println("Date one is not before Date two");
			
			
		}
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		SimpleDate dateOne2 = new SimpleDate();
		dateOne = SimpleDate.of(2010, 12, 27);
		
		SimpleDate dateTwo2 = new SimpleDate();
		dateTwo = SimpleDate.of(2009, 7, 18);
		
		
		if (dateOne2.before(dateTwo2)) {
			
		output.println("Date one is before Date two");
		
		} else {
			output.println("Date one is not before Date two");
			
			
		}
		output.println();
		dateOne2 = SimpleDate.of(1999, 3, 6);
		dateTwo2 = SimpleDate.of(2006, 8, 7);
		
		if (dateOne2.before(dateTwo2)) {
			
		output.println("Date one is before Date two");
		
		} else {
			output.println("Date one is not before Date two");
			
			
		}

		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}