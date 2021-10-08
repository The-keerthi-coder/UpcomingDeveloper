import java.util.Scanner;
class Practice4
{
	public static void main(String[] args) 
	{
	int [] n=new int[10];
	int [] s=new int [10];
		Scanner sc=new  Scanner(System.in);
		System.out.println("\nEnter the values:\n");
		for(int i=0;i<10;i++)
			{	int v=sc.nextInt();
				n[i]=v;
			}
			System.out.print("\nArray element of n array =  [ ");
	for(int i=0;i<10;i++)
		System.out.print(n[i]+ " ");
	System.out.print("] \n\n");

int j=n.length-1;
	for(int i=0;i<10;i++)
			{	
				s[j]=n[i];
				j--;
			}
	System.out.print("\nNew Array element =  [ ");
	for(int i=0;i<n.length;i++)
		System.out.print(s[i]+ " ");
		System.out.print("] \n\n");
	}
}
