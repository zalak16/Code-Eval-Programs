import java.util.*;
import java.io.*;

public class NextIntSequence
{
	ArrayList<String> number = new ArrayList<String>();
	
	void readFile(String filename)
	{
		try
		{
			File file = new File(filename);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String str = Integer.toString(scanner.nextInt());
				number.add("0" + str);
			}
			scanner.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	void test()
	{
		number.add("08000");
	}
	
	ArrayList<String>getPermutation(String str)
	{
		ArrayList<String> permutationlist = new ArrayList<String>();
		char chStr[] = str.toCharArray();
		ArrayList<String> temp = new ArrayList<String>();
		permutationlist.add(Character.toString(chStr[0]));
		for(int j =1; j< chStr.length; j++)
		{
			temp = permutation(chStr[j], permutationlist);
			permutationlist.clear();
			permutationlist = temp;
		}
		
		return permutationlist;
	}
	
	
	ArrayList<String>permutation(char ch, ArrayList<String> list)
	{
		ArrayList<String> perReturn = new ArrayList<String>();
		for(int i =0 ; i<list.size(); i++)
		{
			String str = list.get(i);
			StringBuilder sb;
			
			for(int j=0; j<=str.length(); j++)
			{
				sb = new StringBuilder();
				sb.append(str.substring(0, j));
				sb.append(ch);
				sb.append(str.substring(j));
				perReturn.add(sb.toString());
			}
		}
		return perReturn;
	}
	
	void sort(ArrayList<String> output)
	{
		Collections.sort(output, new Comparator<String>(){
			
			public int compare(String s1, String s2)
			{
				return s1.compareTo(s2);
			}
			
		});
	}
	
	int getNextNumber(ArrayList<String> list, String string)
	{
		int index = list.indexOf(string);
		while(true)
		{
			if(list.get(index).equals(list.get(index + 1)))
			{
				index = index + 1;
			}
			else
			{
				break;
			}
		}
		return Integer.parseInt(list.get(index + 1));
	}
	
	void getNextInt()
	{
		for(int i = 0; i< number.size(); i++)
		{
			ArrayList<String> output = getPermutation(number.get(i));
			//Collections.sort(output);
			sort(output);
			int next = getNextNumber(output, number.get(i));
			
			System.out.println(next);
		}
	}
	

	public static void main(String[] args)
	{
		
		NextIntSequence obj = new NextIntSequence();
		//obj.readFile(args[0]);
		obj.test();
		obj.getNextInt();
		

	}

}
