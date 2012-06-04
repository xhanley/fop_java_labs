class MyApp
{
	public static void main(String[] args)
	{
		int a = 99;
		System.out.println("Hello!");
		myFunc();
		AnotherClass myObj = new AnotherClass();
		myObj.action();
	}

	public static void myFunc()
	{
		System.out.println("MyFunction!!");
	}
}

class AnotherClass
{
  int b = 3;

  public AnotherClass()
  {
    b++;
  }

  void action()
  {
    System.out.println(b);
  }
}