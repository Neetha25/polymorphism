package overriding;

public class sub extends add

{
public void add ()
{
	int i=81; 
   int r=20; int S=i+r;

	System.out.println("sum:"+S);
}
	public static void main(String[] args)
	{
		
		sub ob=new sub();
		ob.add();
		
		// TODO Auto-generated method stub

	}

}
