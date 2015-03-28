import java.io.*;
public class RightmostChar 
{
	int findIndex(String s, String ch)
	{
		return s.lastIndexOf(ch);
	}
	
	public static void main(String args[])
	{
		RightmostChar rc = new RightmostChar();
		try
		{
			File file = new File("input6.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine())!= null)
			{
				String str[] = line.split(",");
				System.out.println(rc.findIndex(str[0], str[1]));
			}
			bf.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			
		}
		
		
	}

}
