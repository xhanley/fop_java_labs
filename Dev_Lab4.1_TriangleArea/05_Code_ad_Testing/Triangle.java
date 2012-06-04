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

// Class defenition
class Triangle
{
	// Private member variables
	private double baseDimension;
	private double heightDimension;
	private double area;	
	
	// Triangle class constructor
	public Triangle()
	{
		// Print test message
		System.out.println("Triangle constructor success!");
		
		// Initialise the variables
		baseDimension = -1;
		heightDimension = -1;
		area = -1;	
	}
	
	// Public method to compute area of triangle
	public void computeArea()
	{
		// Calculation (Note BOMDAS order of evaluation)
		area = baseDimension*heightDimension/2;
		System.out.println("area calculated to be: " + area);		
	}
	
	// Accessor methods
	public void setBaseDimension(double _baseDimension)
	{
		baseDimension = _baseDimension;
		System.out.println("baseDimension set to: " + baseDimension);
	}
	
	public void setHeightDimension(double _heightDimension)
	{
		heightDimension = _heightDimension;
		System.out.println("heightDimension set to: " + heightDimension);		
	}
	
	public double getArea()
	{
		System.out.println("area returned: " + area);
		return area;
	}
}
