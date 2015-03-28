import java.util.Hashtable;


public class LongestCommonSubstringSameString
{

	String longestCommonSubString(String str)
	{
		Hashtable<String, Integer> table = new Hashtable<String, Integer>();
	
		for(int i = 0; i< str.length(); i++)
		{
			int j = str.length();
			while(j > 0 && !str.substring(i, j).equalsIgnoreCase(""))
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
				j--;
			}
		}
			
			int maxlength=0;
			String result="";
			
			for(String s: table.keySet())
			{
				System.out.println(s + " : " + table.get(s));
				if(table.get(s) > 1)
				{
					if(maxlength < s.length())
					{
						maxlength = s.length();
						result = s;
					}
				}
			}

		if(maxlength == 0)
		{
			return str;
		}
		return result;
	}
	
	public static void main(String args[])
	{
		LongestCommonSubstringSameString obj = new LongestCommonSubstringSameString();
		System.out.println(obj.longestCommonSubString("Mississippi"));

	}
}
