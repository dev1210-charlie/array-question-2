import java.util.Scanner; 
class Array5
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a size of array");
		int n=in.nextInt();
		int []x=new int[n];
        System.out.print("enter a no of array\n");		
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
		}
		sort(x,n);
	//	System.out.println("sort list:- "+sort(x,n));
	}
	static void sort(int x[],int n)
	{ 
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(x[i]==x[j])
				{
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("sort list:- "+x[i]);
		}
	}
}