import java.io.*;
import java.util.*;

public class HexaToDecimal 
{
	
	public static void main(String args[])
	{
		try
		{
			File file = new File("input10.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				
				int hex = scanner.nextInt(16);
				System.out.println(hex);
				
			}
			scanner.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	
}
