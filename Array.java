import java.util.Scanner; 
class Array1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a size of array");
		int n=in.nextInt();
		int []x=new int[n]; 
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
		}
		System.out.println(max(x,n));
	}
	static int max(int x[],int n)
	{
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(max<x[i])
			{
				max=x[i];
			}
		}
		return max;
	}
}