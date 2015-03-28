import java.util.*;
import java.io.*;

public class SwapCase 
{
	static String swapCase(String str)
	{
		char letter[] = str.toCharArray();
		
		for(int i= 0; i< letter.length; i++)
		{
			char ch;
			 if(letter[i] >= 'a' && letter[i] <='z')
			 {
				 ch = (char) (letter[i] - 'a' + 'A');
				 letter[i] = ch;
			 }
			 else if(letter[i] >= 'A' && letter[i] <='Z')
			 {
				 ch =(char) (letter[i]-'A' + 'a');
				 letter[i] = ch;
			 }
			 else 
			 {
				 continue;
			 }
		}
		return String.valueOf(letter);
	}
	public static void main(String args[]) throws IOException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext())
		{
			String line = scanner.nextLine();
			System.out.println(swapCase(line));
		}
		scanner.close();
	}
	
}
