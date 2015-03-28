
public class OddNumber 
{
	static void printOdd()
	{
		for(int i =1; i < 100; i++)
		{
			if(i %2 != 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		printOdd();
	}
}
