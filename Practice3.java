import java.util.Scanner;
class Practice3
{
	public static void main(String[] args) 
	{
	int [] n=new int[20];
	int w=0,p=0,z=0,e=0,o=0,m=0;
		Scanner s=new  Scanner(System.in);
		System.out.println("\nEnter the values:\n");
		for(int i=0;i<20;i++)
			{	int v=s.nextInt();
				n[i]=v;
			}
			System.out.print("\nArray element of n array =  [ ");
	for(int i=0;i<20;i++)
		System.out.print(n[i]+ " ");
	System.out.print("] \n\n");
for(int i=0;i<20;i++)
		{
	if(n[i]>=0  || n[i]<0)
		{
			if(n[i]==0)
				z++;
			else if(n[i]<0)
				m++;
			else
				p++;
		}
	 if( n[i]!=0)
			{
		 if(n[i]%2==0)
			 e++;
		else
		 o++;
		
		}
		}
		
			
			System.out.println("Even count= "+e);
			System.out.println("Positive count= "+p);
			System.out.println("Negative count= "+m);
			System.out.println("Zero count= "+z);
			System.out.println("Odd count= "+o);
	}
	}
