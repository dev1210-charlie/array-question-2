class MaxValue1
{
	public static void main(String... s)
	{
		int x[]={8,7,5,4,3,2,9,6,1};
		int max=x[0];
		for(int i=0;i<x.length;i++)
		{
			if(max<x[i])
			{
				max=x[i];
			}
		}
		System.out.println("maximun value"+max);
	}
}