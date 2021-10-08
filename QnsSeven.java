class FactN
{
public static  int fact(int n)
{
	if(n==0)
		return 0;
	else if(n==1 ||n==2)
		return n;
	else
	{	int f;
		f=n*fact(n-1);
		return f;
	}

}
}
class QnsSeven
{
	public static void main(String[] args) 
	{
		int [] a ={3,6,10,4,8,5};
		int w=0;
	for(int i=0;i<a.length;i++)
    System.out.println(a[i]+"\t");
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
			else
				w=a[j];
        }
    }
	System.out.println("\nGreatest number of an array:"+ w);
    FactN m=new FactN();
		 int f=m.fact(w);
	System.out.println("\nFactorial of "+w+" = "+f);

	}
}
	
	
