class GrandParent
{
	public void print()
	{
		System.out.println("Inside GrandParent");
	}
}
class Parent extends GrandParent
{
	public void print()
	{
		System.out.println("Inside Parent");
	}
}
class Child extends Parent
{
	public void print()
	{
		System.out.println("Inside Child");
	}
}
public class RunTimePoly
{
	public static void main(String[] args)
	{
		GrandParent gref;
		gref = new GrandParent();
		System.out.println("Calling Grandparent with gref");
		gref.print();
		System.out.println("Calling parent with gref");
		gref = new Parent();
		gref.print();
		System.out.println("Calling Child with gref");
		gref = new Child();
		gref.print();		
	}
}