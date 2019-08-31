package assignment01;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PlaceDOBTester {
	
	public static void main (String args[]) {
		
		DateAndPlaceOfBirth Person1 = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
		DateAndPlaceOfBirth Person2 = new DateAndPlaceOfBirth(1999, 12, 27, "Los Angeles", "CA", "USA");
		DateAndPlaceOfBirth Person3 = new DateAndPlaceOfBirth(2000, 12, 27, "Queens", "NY", "USA");
		DateAndPlaceOfBirth Person4 = new DateAndPlaceOfBirth(2001, 3, 8, "Moscow", "RU");
		DateAndPlaceOfBirth Person5 = new DateAndPlaceOfBirth(1998, 6, 8, "London", "UK");
		
		System.out.println(Person1);	
		System.out.println(Person2);
		System.out.println(Person3);
		System.out.println(Person4);
		System.out.println(Person5);	
		
		System.out.println();
		
		System.out.println("Testing olderThan method...");
		System.out.println(Person1.olderThan(Person2));
		System.out.println(Person1.olderThan(Person3));
		System.out.println(Person1.olderThan(Person4));
		System.out.println(Person1.olderThan(Person5));
		
		System.out.println(Person2.olderThan(Person3));
		System.out.println(Person2.olderThan(Person4));
		System.out.println(Person2.olderThan(Person5));
		
		System.out.println(Person3.olderThan(Person4));
		System.out.println(Person4.olderThan(Person5));
		System.out.println();
		
		System.out.println("Testing youngerThan method...");
		System.out.println(Person1.youngerThan(Person2));
		System.out.println(Person1.youngerThan(Person3));
		System.out.println(Person1.youngerThan(Person4));
		System.out.println(Person1.youngerThan(Person5));
		
		System.out.println(Person2.youngerThan(Person3));
		System.out.println(Person2.youngerThan(Person4));
		System.out.println(Person2.youngerThan(Person5));
		
		System.out.println(Person3.youngerThan(Person4));
		System.out.println(Person4.youngerThan(Person5));
		System.out.println();
		
		System.out.println("Testing hasSameBirthDateAs method...");
		System.out.println(Person1.hasSameBirthDateAs(Person2));
		System.out.println(Person1.hasSameBirthDateAs(Person3));
		System.out.println(Person1.hasSameBirthDateAs(Person4));
		System.out.println(Person1.hasSameBirthDateAs(Person5));
		
		System.out.println(Person2.hasSameBirthDateAs(Person3));
		System.out.println(Person2.hasSameBirthDateAs(Person4));
		System.out.println(Person2.hasSameBirthDateAs(Person5));
		
		System.out.println(Person3.hasSameBirthDateAs(Person4));
		System.out.println(Person4.hasSameBirthDateAs(Person5));
		System.out.println();
		
		System.out.println("Testing hasSameBirthDayAs method...");
		System.out.println(Person1.hasSameBirthDayAs(Person2));
		System.out.println(Person1.hasSameBirthDayAs(Person3));
		System.out.println(Person1.hasSameBirthDayAs(Person4));
		System.out.println(Person1.hasSameBirthDayAs(Person5));
		
		System.out.println(Person2.hasSameBirthDayAs(Person3));
		System.out.println(Person2.hasSameBirthDayAs(Person4));
		System.out.println(Person2.hasSameBirthDayAs(Person5));
		
		System.out.println(Person3.hasSameBirthDayAs(Person4));
		System.out.println(Person4.hasSameBirthDayAs(Person5));
		System.out.println();
		
		System.out.println("Completed");
		
		
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");
			
		DateAndPlaceOfBirth Person12 = new DateAndPlaceOfBirth(1999, 12, 27, "Brooklyn", "NY", "USA");
		DateAndPlaceOfBirth Person22 = new DateAndPlaceOfBirth(1999, 12, 27, "Los Angeles", "CA", "USA");
		DateAndPlaceOfBirth Person32 = new DateAndPlaceOfBirth(2000, 12, 27, "Queens", "NY", "USA");
		DateAndPlaceOfBirth Person42 = new DateAndPlaceOfBirth(2001, 3, 8, "Moscow", "RU");
		DateAndPlaceOfBirth Person52 = new DateAndPlaceOfBirth(1998, 6, 8, "London", "UK");
		
		output.println(Person12);	
		output.println(Person22);
		output.println(Person32);
		output.println(Person42);
		output.println(Person52);	
		
		output.println();
		
		output.println("Testing olderThan method...");
		output.println(Person12.olderThan(Person22));
		output.println(Person12.olderThan(Person32));
		output.println(Person12.olderThan(Person42));
		output.println(Person12.olderThan(Person52));
		
		output.println(Person22.olderThan(Person32));
		output.println(Person22.olderThan(Person42));
		output.println(Person22.olderThan(Person52));
		
		output.println(Person32.olderThan(Person42));
		output.println(Person42.olderThan(Person52));
		output.println();
		
		output.println("Testing youngerThan method...");
		output.println(Person12.youngerThan(Person22));
		output.println(Person12.youngerThan(Person32));
		output.println(Person12.youngerThan(Person42));
		output.println(Person12.youngerThan(Person52));
		
		output.println(Person22.youngerThan(Person32));
		output.println(Person22.youngerThan(Person42));
		output.println(Person22.youngerThan(Person52));
		
		output.println(Person32.youngerThan(Person42));
		output.println(Person42.youngerThan(Person52));
		output.println();
		
		output.println("Testing hasSameBirthDateAs method...");
		output.println(Person12.hasSameBirthDateAs(Person22));
		output.println(Person12.hasSameBirthDateAs(Person32));
		output.println(Person12.hasSameBirthDateAs(Person42));
		output.println(Person12.hasSameBirthDateAs(Person52));
		
		output.println(Person22.hasSameBirthDateAs(Person32));
		output.println(Person22.hasSameBirthDateAs(Person42));
		output.println(Person22.hasSameBirthDateAs(Person52));
		
		output.println(Person32.hasSameBirthDateAs(Person42));
		output.println(Person42.hasSameBirthDateAs(Person52));
		output.println();
		
		output.println("Testing hasSameBirthDayAs method...");
		output.println(Person12.hasSameBirthDayAs(Person22));
		output.println(Person12.hasSameBirthDayAs(Person32));
		output.println(Person12.hasSameBirthDayAs(Person42));
		output.println(Person12.hasSameBirthDayAs(Person52));
		
		output.println(Person22.hasSameBirthDayAs(Person3));
		output.println(Person22.hasSameBirthDayAs(Person42));
		output.println(Person22.hasSameBirthDayAs(Person52));
		
		output.println(Person32.hasSameBirthDayAs(Person42));
		output.println(Person42.hasSameBirthDayAs(Person52));
		output.println();
		
		output.println("Completed");
			
			
			
			
			
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
		
}
