 class Mobike
{
String number;
String name;
int day;
int charge;
void input()
{
System.out.println("enter the number");
 number=new java.util.Scanner(System.in).nextLine();
System.out.println("enter tne name");
 name=new java.util.Scanner(System.in).nextLine();
System.out.println("enter the no of day");
 day=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
if(day<=5)
{
	charge=day*500;

	}
else if(day<=10)
{
	charge=5*500+((day-5)*400);
}
else
{	
charge=5*500+5*400+((day-10)*200);
}

}
void display()
{
System.out.println("bikeno.\tCustomer name\tdays\tcharge");
System.out.println(number+"\t"+name+"t"+day+"\t"+charge);
}
public static void main(String[] arg)
{
Mobike s1=new Mobike();
s1.input();
s1.compute();
s1.display();
}
}

