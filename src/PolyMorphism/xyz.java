package PolyMorphism;

public class xyz extends Test
{
	public String Test()
{
	System.out.println(2);
	return null;
}
public static void main(String[]args)
{
	Test t=new Test();
	t.Test();
	xyz x=new xyz();
	x.Test();
}
}
