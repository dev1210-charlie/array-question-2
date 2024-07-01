import java.util.Scanner; 
class Array2
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
		System.out.println(min(x,n));
	}
	static int min(int x[],int n)
	{
		int min=x[0];
		for(int i=0;i<n;i++)		
		{   
			if(min>x[i])
			{
				min=x[i];
			}
		}
		return min;
	}
}