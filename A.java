
class B
{
	int a;
	void getdata(int x) { a = x; }
	void printdata() { System.out.println("a=" + a); }
	
}
class A
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		B ob = new B();
		ob.getdata(5);
		ob.printdata();
	}
}