class QnsEight 
{
	public static void main(String[] args) 
	{
int [] x={2,6,3,7,4};int [] y={0,3,4,5,8};int [] z={1,2,3,6,9};
for(int i=0;i<5;i++){
	for(int j=0;j<5;j++){
		for(int k=0;k<5;k++){
	if(x[i]==y[j]){
		if(x[i]==z[k]){
			System.out.println("Common Element is= "+x[i]);
				}}
	else
			continue;
	}}}
	System.out.println("No common Elements in an array");
	}
}

