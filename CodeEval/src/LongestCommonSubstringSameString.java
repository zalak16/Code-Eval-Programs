import java.util.Hashtable;


public class LongestCommonSubstringSameString
{

	String longestCommonSubString(String str)
	{
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
	
		for(int i = 0; i< str.length(); i++)
		{
			int j = 1;
			while(j < (str.length()- i))
			{
				String s = str.substring(i, j).toLowerCase();
				if(table.containsKey(s))
				{
					int count = table.get(s);
					table.put(s, count + 1);
				}
				else
				{
					table.put(s, 1);
				}
				j++;
			}
		}
			
			int maxlength=0;
			String result="";
			for(String s: table.keySet())
			{
				
				if(table.get(s) > 1)
				{
					if(maxlength < s.length())
					{
						maxlength = s.length();
						result = s;
					}
				}
				
				else
				{
					result = s;
				}
			}
			
		return result;
	}
	
	public static void main(String args[])
	{
		LongestCommonSubstringSameString obj = new LongestCommonSubstringSameString();
		System.out.println(obj.longestCommonSubString("banana"));
//		i = 1 j=1 b
//			  j =2 ba
//			  3 ban
//			  4 bana
//			  5 banan
//			  6 banana
	}
}
