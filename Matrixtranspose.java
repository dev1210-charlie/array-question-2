class Matrixtranspose
{
public static void main(String... s)
{
int x[][]={{1,2,3},{3,4,5},{5,6,7}};
//int y[][]={{9,8,7},{7,6,5},{5,4,3}};
int transpose[][]=new int[3][3];
for(int i=0;i<3;i++)
{for(int j=0;j<3;j++)
{
 transpose[i][j]=x[j][i];
 System.out.println(transpose[i][j]);
 }
  System.out.println();
 }
 }
 }