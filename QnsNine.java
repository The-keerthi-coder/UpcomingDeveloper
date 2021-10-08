class QnsNine {
	public static void main (String[] args)
	{
		int a1[] = {7,-3,5,9,-1,0,-3};
		int n = a1.length;
		System.out.println("\nNormal Array\n");
		for (int i = 0; i < n; i++)
			System.out.print(a1[i] + " ");
	
		int j = -1;
		for (int i = 0; i <n; i++)
		{
			if (a1[i] < 0)
			{
				j++;
				int a = a1[j];
				a1[j] = a1[i];
				a1[i] = a;
			}
		}

		int p = j+1, neg = 0;

		while (p < n && neg < p && a1[neg] < 0)
		{
			int a = a1[neg];
			a1[neg] = a1[p];
			a1[p] = a;
			p++;
			neg += 2;
		}
		System.out.println("\nRearranging Array \n");
		for (int i = 0; i < n; i++)
			System.out.print(a1[i] + " ");
	
		System.out.println("\n\n");
	}
		}

