class MatrixSum
{
public static void main(String... s)
{
int rows,cols,sumrows,sumcols;
int x[][]={{1,2,3},{3,4,5},{5,6,7}};
rows=x.length;
cols=x[0].length;
for(int i=0;i<rows;i++)
{ sumrows=0;
for(int j=0;j<rows;j++)
{
sumrows=sumrows+x[i][j];
}
System.out.println("Sum of "+(i+1)+" Row :- "+sumrows);
}
for(int i=0;i<cols;i++)
{ sumcols=0;
for(int j=0;j<cols;j++)
{
sumcols=sumcols+x[i][j];
}
System.out.println("Sum of "+(i+1)+" Column :- "+sumcols);
}
}
}