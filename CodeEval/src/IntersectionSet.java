import java.io.*;
import java.util.ArrayList;
public class IntersectionSet 
{
	void findIntersection(String line)
	{
		String set[] = line.split(";");
		
		String setArr1[] = set[0].split(",");
		int arr1[] = new int[setArr1.length];
		
		for(int i= 0; i<setArr1.length; i++)
		{
			arr1[i] = Integer.parseInt(setArr1[i]);
		}
	
		String setArr2[] = set[1].split(",");
		int arr2[] = new int[setArr2.length];
		
		for(int i= 0; i<setArr2.length; i++)
		{
			arr2[i] = Integer.parseInt(setArr2[i]);
		}
		ArrayList<Integer> output = new ArrayList<>();
		
		int j =0;
		int flag = 0;
		for(int i= 0; i< arr1.length; i++)
		{
			while(j < arr2.length)
			{
				if(arr1[i] == arr2[j])
				{
					output.add(arr1[i]);
					flag = j;
					break;
				}
				if(arr1[i] < arr2[j])
				{
					break;
				}
				j++;
				
			}
			j=flag;
		}
	
		if(output.size() != 0)
		{
			System.out.print("\n" + output.get(0));
			for(int i= 1 ; i < output.size(); i++)
			{
				System.out.print("," + output.get(i));
				
			}
		}
	
	}
	
	public static void main(String args[])
	{
		IntersectionSet is = new IntersectionSet();
		try
		{
			File file = new File("input5.txt");
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			
			while((line = bf.readLine()) != null)
			{
				if(line.isEmpty())
				{
					System.out.println(" ");
					continue;
				}
				
				is.findIntersection(line);
			}
			bf.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
