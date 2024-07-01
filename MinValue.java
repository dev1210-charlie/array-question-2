class MinValue1
{
	public static void main(String... s)
	{
		int x[]={8,7,5,4,3,2,9,6,1};
		int min=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(min>x[i])
			{
				min=x[i];
			}
		}
		System.out.println("minimun value"+min);
	}
}