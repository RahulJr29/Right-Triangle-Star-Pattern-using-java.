class Star
{
	public static void main(String args[])
	{
		int i,j;
		for(i=0;i<Integer.parseInt(args[0]);i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
