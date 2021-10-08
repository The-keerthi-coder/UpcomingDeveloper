import java.util.Scanner;
class Practice5 
{
	public static void main(String[] args) 
	{
		int [] n=new int[6];
	int w=0;
		Scanner s=new  Scanner(System.in);
		System.out.println("\nEnter the values:\n");
		for(int i=0;i<n.length;i++)
			{	int v=s.nextInt();
				n[i]=v;
			}
			System.out.print("\nArray element of n array =  [ ");
	for(int i=0;i<n.length;i++)
		System.out.print(n[i]+ " ");
	System.out.print("] \n\n");

		int len=n.length;
			int j=len-1;
for(int i=0;i<len;i++)
		{
		if(n[i]==n[j])
			w++;
			j--;
		}
			if(w==len)
			System.out.println("\nGiven array elements are same from front to back\n");
			else
		System.out.println("\nGiven array elements are  not same from front to back\n");
	}
}
