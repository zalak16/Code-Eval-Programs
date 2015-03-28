import java.io.*;
public class SumOfDigits {

	int sumDigits(int num)
	{
		int sum = 0;
		while(num != 0)
		{
			sum = sum + (num % 10);
			num = num /10;
		}
		return sum;
	}
/*	public static void main(String args[])
	{
		SumOfDigits sd = new SumOfDigits();
		//Main sd = new Main();
		try
		{
			File file = new File("input2.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line=bf.readLine()) != null)
			{
				line = line.trim();
				System.out.println(sd.sumDigits(Integer.parseInt(line)));
			}
			bf.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}*/
}
