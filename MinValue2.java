class MinValue2
{
public static void main(String... s)
{
int x[][]={{1,9,4},{2,100,5},{4,5,6}};
int min=x[0][0];
for(int i=0;i<3;i++)
{for(int j=0;j<3;j++)
{
if(min>x[i][j])
{
min=x[i][j];
}
}
}
for(int i=0;i<3;i++)
{for(int j=0;j<3;j++)
{
System.out.println(min);
}
}
}}