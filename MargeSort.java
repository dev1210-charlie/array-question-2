class MargeSort
{
public static void main(String... s)
{
int[]x={15,9,7,13,12,16,4,18,11};
int length=x.length;
}
void partition(int[]x,int low, int high)
{
int privot=x[(low+high)/2];
while(low<=high)
{
 while(x[low]<privot)
 {
  low++;
  }
  while(x[high]>privot)
  {
  high--;
  }
  if(low<=high)
  {
  int temp=x[low];
  x[low]=x[high];
  x[high]=temp;
  low++;
   high--;
	}
	} 
	return low;
}

}