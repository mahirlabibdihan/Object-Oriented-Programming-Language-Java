public class For {
	public static void main(String[] args) {
		int[] x={1,2,3,4,5};
		int[][] y={{1,2,3},{4,5,6}};

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();

		for(int i:x)
		{
			System.out.print(i+" ");
		}
		System.out.println();

		for(int i=0;i<y.length;i++)
		{
			for(int j=0;j<y[i].length;j++)
			{
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}

		for(int[] i:y)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
