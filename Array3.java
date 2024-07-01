import java.util.Scanner; 
class Array3
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a size of array");
		int n=in.nextInt();
		int [][]x=new int[n][n];
        System.out.print("enter a no of array\n");		
		for(int i=0;i<n;i++)
		{for(int j=0;j<n;j++)
			{
			x[i][j]=in.nextInt();
			}
		}
		System.out.println("x[i][j]"+max(x,n));
	}
	static int max(int x[][],int n)
	{
		int max=x[0][0];
		for(int i=0;i<n;i++)		
		{  for(int j=0;j<n;j++)
			{			
			if(max<x[i][j])
			{
				max=x[i][j];
			}
			}
		}
		return max;
	}
}