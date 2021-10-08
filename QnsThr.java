//Qns3:Write the program to sort the array
//Ans:
class QnsThr 
{
	public static void main(String[] args) 
	{
		int [] a={-52,6,-3,74,0};
	int w;
    System.out.println("\n\n Normal Array\n");
	for(int i=0;i<a.length;i++)
		System.out.print(" "+a[i]);
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {

                w=a[i];
                a[i]=a[j];
                a[j]=w;
            }
        }
    }
    System.out.println("\n\n Ordered Array\n");
    for(int i=0;i<5;i++)
            System.out.print(" "+a[i]);

	System.out.println("\n\n");
	}
}
