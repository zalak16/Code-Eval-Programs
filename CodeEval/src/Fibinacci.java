/**
 * The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n–1) + F(n–2) when n>1. 
 * Given an integer n≥0, print out the F(n).
 * @author Zalak
 *
 */
import java.io.*;

public class Fibinacci {

	int fibonacci(int n)
	{
		if(n == 0)
			return 0;
		if(n < 2)
			return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String args[])
	{
		Fibinacci fb = new Fibinacci();
		//Main fb = new Main();
		File file = new File("input3.txt");
		try
		{
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf. readLine())!= null)
			{
				line = line.trim();
				System.out.println(fb.fibonacci(Integer.parseInt(line)));
			}
			bf.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
