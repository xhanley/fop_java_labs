/**
*	FOP Lab 4.1
*	Area calculation app.
*	Uses JavaBook and Triangle class
*
*	Donnchadh O h-Ainle
*	WebElevate 1.2
* 	D11128288
* 	donchadh.oh-aile@webelevate.ie
*/

// Import all the classes in the javabook package
import javabook.*;

// Main class defenition
class App
{
	// Main method.  This is the code entry point.
	public static void main(String[] args)
	{
		// Create a App type reference and instantiate a new App object
		App thisProgram = new App();	
	}
	
	// App class constructor
	public App()
	{
		// Print out a test message to the console to confirm running program
		// Uses java.lang library System.out to do priting to console
		System.out.println("App constructor success!");
		
		// Delare and instantiate objects
		MainWindow myWindow = new MainWindow();
		InputBox inBox = new InputBox(myWindow);
		OutputBox outBox = new OutputBox(myWindow);
			
		// Render the main window
		myWindow.show();
		
		// Declare and initialise variables to default values
		double baseDimension = -1;
		double heightDimension = -1;
		double area = -1;
		
		// Get input form the user
		baseDimension = inBox.getDouble("Please enter the size of the base in mm: ");
		heightDimension = inBox.getDouble("Please enter the height in mm: ");

		
		// Debug output
		System.out.println("The base entered was: " + baseDimension);
		System.out.println("The height entered was: " + heightDimension);
		
		// TODO code!
		// Create the Triangle object
		// Calculate the area
		// Return the calculated area
		
		outBox.show();
		outBox.println("The triangle area was computed to be: " + area);
	}
}
