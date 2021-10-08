class QnsTen 
{
	public static void main(String[] args) 
	{
		int [] array={3,5,7,1,9,25};
		int Sum=0,Product=1;
		for(int i=0;i<array.length;i++)
		{	 Sum+=array[i];
		  Product*=array[i]; 
		}
		System.out.println("Sum of an array element: "+ Sum);
		System.out.println("Product of an array element: "+ Product);
	}
}
