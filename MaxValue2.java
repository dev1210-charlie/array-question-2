class MaxValue2
{
public static void main(String... s)
{
int x[][]={{1,9,4},{2,100,5},{4,5,6}};
int max=x[0][0];
for(int i=0;i<x.length;i++)
{for(int j=0;j<x.length;j++)
{if(max<x[i][j])
{
 max=x[i][j];
}
}}
for(int i=0;i<x.length;i++)
{for(int j=0;j<x.length;j++)
{
System.out.println("MaxValue2:-"+max);
}
} 
}}
 