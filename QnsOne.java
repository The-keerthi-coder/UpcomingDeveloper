//Qns1:Find the Minimum and Maximum element in an array.
//Ans1:
class QnsOne 
{
	public static void main(String[] args) 
	{
		int  [] a={2,40,5,30,6};
		int w=0,n;
		n=a.length;
	for(int i=0;i<n;i++)
    System.out.println(a[i]+"\t");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                 w=a[i];
                a[i]=a[j];
                a[j]=w;
            }
			else
				w=a[j];
        }
    }
    
    System.out.println("\n Min value ="+a[0]);
	System.out.println("\n Max value="+w);
	}
}
