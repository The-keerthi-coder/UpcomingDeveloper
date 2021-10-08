//Qns2:Reverse an array
//Ans:
class QnsTwo 
{
	public static void main(String[] args) 
	{
		int [] a={1,4,6,3,9};
		System.out.println("\nNormal Array:\n");
						System.out.print("[");
for(int i=0;i<a.length;i++)
    System.out.print(" "+a[i]);
				System.out.print(" ] \n");
		System.out.println("\nReversal Array:\n");
				System.out.print("[");
  for(int i=a.length-1;i>=0;i--)
            System.out.print(" "+a[i]);
  				System.out.print(" ]\n\n");
	}
}

