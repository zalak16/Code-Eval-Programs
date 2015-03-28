public class Multiplication {
	
	void printMultiplication()
	{
		for(int i= 1; i < 13; i++)
		{
			for(int j = 1; j< 13; j++)
			{
				long val = i*j;
				System.out.format("%4d", val);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String args[])
	{
		Multiplication mul = new Multiplication();
		mul.printMultiplication();
		
	}

}
