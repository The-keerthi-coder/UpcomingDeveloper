import java. util.Scanner;
class Practice2 
{
	public static void main(String[] args) 
	{
	int [] n=new int[10];
	int w=0;
		Scanner s=new  Scanner(System.in);
		System.out.println("\nEnter the values:\n");
		for(int i=0;i<10;i++)
			{	int v=s.nextInt();
				n[i]=v;
			}
			System.out.print("\nArray element of n array =  [ ");
	for(int i=0;i<10;i++)
		System.out.print(n[i]+ " ");
	System.out.print("] \n\n");
System.out.println("\nEnter your check value:");
int c=s.nextInt();
for(int i=0;i<10;i++)
		{
if(n[i]==c)
	w++;
/*else
	v++;*/
		}

if(w!=0)
	System.out.println("\nThe value "+c+" is present in an array\n");
else
	System.out.println("\nThe value "+c+" is not present in an array\n");


	}
}
