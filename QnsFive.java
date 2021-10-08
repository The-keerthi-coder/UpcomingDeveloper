//Qns5: Arrange negative and positive element in different side
//Ans:
class QnsFive 
{
	public static void main(String[] args) 
	{
		    int n=4;
		int [] a={9,8,-4,-2};
		int [] b={7,6,-3,-1};
			 int [] w=new int[n];
			 			 int [] w1=new int[n];
			 int [] r=new int[n];
			 			 int [] r1=new int[n];
			 int j=0,k=0;
 System.out.println("\n Normal Array\n\n");
System.out.print("[");
for(int i=0;i<n;i++)
    System.out.print(" "+a[i]);
 System.out.println(" ]\n");
 System.out.print("[");
for(int i=0;i<n;i++)
	System.out.print(" "+b[i]);
    System.out.println(" ]\n");
for(int i=0;i<n;i++)
{
	if(a[i]<0 && b[i]<0)
    {
	if(a[i]<0)
		 w[j]=a[i];
		w1[j]=b[i];
        j++;
    }
  else     {
if(a[i]>=0)
        r[k]=a[i];

	r1[k]=b[i];
        k++;
    }

}
System.out.println("\n\nNegative array:\n\n");
System.out.print("[");
    for(int i=0;i<j;i++)
        System.out.print(" "+w[i]);
	for(int i=0;i<j;i++)
        System.out.print(" "+w1[i]);
System.out.print("]");
 System.out.println("\n\nPositive array:\n\n");
System.out.print("[");
	for(int i=0;i<k;i++)
        System.out.print(" "+r[i]);
	for(int i=0;i<k;i++)
        System.out.print(" "+r1[i]);
System.out.print("]");
System.out.println("\n\n");
	}
}
