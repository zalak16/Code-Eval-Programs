import java.io.*;
import java.util.ArrayList;

public class RemoveDuplicates {
	
	void removeDuplicate(String line)
	{
		String[] words = line.split(",");
		ArrayList<Integer> arr = new ArrayList<Integer>(); 
		
		System.out.print("\n");
		for(int i= 0; i< words.length; i++)
		{
			arr.add(Integer.parseInt(words[i]));
		}
		
		System.out.print(arr.get(0));
		for(int i= 1; i< arr.size(); i++)
		{
			
			if(arr.get(i) != arr.get(i-1))
			{
				System.out.print("," + arr.get(i));
			}
		}
		
		
	}
	
	public static void main(String args[])
	{
		RemoveDuplicates rd = new RemoveDuplicates();
		try
		{
			File file = new File("input4.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine())!= null)
			{
				line = line.trim();
				rd.removeDuplicate(line);
			}
			bf.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
