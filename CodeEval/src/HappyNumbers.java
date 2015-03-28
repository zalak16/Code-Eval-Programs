import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class HappyNumbers 
{
	int checkNumber(int num)
	{
		ArrayList<Integer> output = new ArrayList<>();
		int sum;
		output.add(num);
		while(num != 1)
		{
			int n= num;
			sum = 0;
			while(n != 0)
			{
				sum = (int) (sum +(Math.pow((n %10), 2)));
				n= n/10;
			}
			
			if(output.contains(sum))
			{
				return 0;
			}
			else
			{
				output.add(sum);
				num = sum;
			}
		}
		return 1;
	}
	
	public static void main(String args[])
	{
		HappyNumbers hn = new HappyNumbers();
		try
		{
			File file = new File("input7.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				System.out.println(hn.checkNumber(scanner.nextInt()));
			}
			scanner.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
	}

}
