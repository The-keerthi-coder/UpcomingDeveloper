//Qns6:Find Duplicate element in an array
//Ans:
class QnsSix 
{
	public static void main(String[] args) 
	{
int [] s={1,4,3,6,7,3,9};
int w=0,v=0,n;
n=s.length;
for(int i=0;i<n;i++)
    System.out.print(" "+s[i]);

    for(int i=0;i<n-1;i++)
    {
		for(int j=i+1;j<n;j++)
		{
		if(s[i]==s[j])
			{	w++;
				v=s[i];
			}
		}
	}
	if(w!=0)
		System.out.println("\nHaving Dupicate Element  "+v+" in an array");
	else
	 System.out.println("\n All are Unique Element in an Array");
	
}
}

