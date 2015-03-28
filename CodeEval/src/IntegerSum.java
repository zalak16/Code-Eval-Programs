import java.io.*;

public class IntegerSum {

	public static void main(String args[])
	{
		int sum =0;
		try
		{
			File file = new File(args[0]);
			BufferedReader bf  = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine()) != null)
			{
				sum = sum + Integer.parseInt(line);
			}
			
			System.out.print(sum);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
