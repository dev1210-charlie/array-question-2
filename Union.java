import java.util.Scanner;
class Union
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a size of array");
		int n=in.nextInt();
		int []x=new int[n];
		int []y=new int[n];
		System.out.println("enter a first of array");
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
		}
		System.out.println("enter a secand of array");
		for(int i=0;i<n;i++)
		{
			y[i]=in.nextInt();	
		}
		union(x,y,n);
	}
	static void union(int x[],int y[],int n)
	{
        //int length=n+n;
		int []marge=new int[n];
		//int pos=0;
		for(int i=0;i<n;i++)
		{
			marge[i]=x[i];
			//pos++;
		}
		for(int i=0;i<n;i++)
		{
			marge[i]=y[i];
			//pos++;
		}
		int m=n+n;
		for(int i=0;i<m;i++)
		{
      System.out.print(merge[i]);
		}
	}
}