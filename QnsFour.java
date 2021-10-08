//Qns4:Occurance of an integer in an array
//Ans:
class QnsFour 
{
	public static void main(String[] args) 
	{
		int [] a={3,6,3,33,7,4,8};
		int w=1,v=0,n;
		n=a.length;
for(int i=0;i<n;i++)
    System.out.println(" "+a[i]);

   for(int i=0;i<n-1;i++)
    {
		for(int j=i+1;j<n;j++)
		{
		if(a[i]==a[j])
			{	w++;
				v=a[i];
			}
		}
	}
	if(w!=0)
		System.out.println("\n"+v+" occurances "+w+" times in an array");
	else
		System.out.println("No occurances values");
	
	}
}
