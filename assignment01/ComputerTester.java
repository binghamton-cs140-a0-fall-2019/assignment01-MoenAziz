package assignment01;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.

		Computer comp1 = new Computer("Dell", "Intel 7700k", 8, 3000, true, 1400.00);
		Computer comp2 = new Computer("ASUS", "Intel 8700k", 16, 300, false, 700.00);
		Computer comp3 = new Computer("Samsung", "Intel 4700k", 12, 5000, true, 900.00);
		Computer comp4 = new Computer("Acer", "Intel 3700k", 32, 200, false, 500.00);
		
		
		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);
		System.out.println();
	



		try(PrintWriter output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		
		Computer comp12 = new Computer("Dell", "Intel 7700k", 8, 3000, true, 1400.00);
		Computer comp22 = new Computer("ASUS", "Intel 8700k", 16, 300, false, 700.00);
		Computer comp32 = new Computer("Samsung", "Intel 4700k", 12, 5000, true, 900.00);
		Computer comp42 = new Computer("Acer", "Intel 5700k", 32, 100, false, 500.00);
		
		
		output.println(comp12);
		output.println(comp22);
		output.println(comp32);
		output.println(comp42);
		output.println();



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}