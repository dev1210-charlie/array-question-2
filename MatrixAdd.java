class MatrixAdd
{
public static void main(String... s)
{
int x[][]={{1,2,3},{3,4,5},{5,6,7}};
int y[][]={{9,8,7},{7,6,5},{5,4,3}};
int add[][]=new int[3][3];
for(int i=0;i<3;i++)
{for(int j=0;j<3;j++)
{
  add[i][j]=x[i][j]+y[i][j];
  System.out.println(add[i][j]);
}
 System.out.println();
}
}
}