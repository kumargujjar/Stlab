import java.util.*;
public class tri
{
	int a,b,c;
	public static void main(String args[])
	{
		System.out.println("Enter the sides of tringle\n");
		tri t= new tri();
		t.get();
		if((t.checkV())==1)
		{
			t.checktype();
		}
	}
	
	void get()
	{
		Scanner in =new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
	}
	
	int checkV()
	{
		if((a<b+c)&&(b<c+a)&&(c<b+a))
		{
			if(a>1 && a<10)
			if(b>1 && b<10)
			if(c>1 && c<10)
			System.out.println("a valid  tringle\n");
			return 1;
		}
		else
		System.out.println("invalid  tringle\n");
		return 0;
	}
	
	void checktype()
	{
		if(a==b && b==c)
		System.out.println("equilatoral tringle\n");
		else
		if(a==b||b==c||c==a)
		System.out.println("isosceles tringle\n");
		else
		System.out.println("scalene tringle\n");
	}
}
