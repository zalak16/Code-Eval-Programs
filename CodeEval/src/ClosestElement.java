import java.util.*;

public class ClosestElement
{

	ArrayList<Integer> searchClosestElement(int x, int arr[])
	{
	    ArrayList<Integer> list = new ArrayList<Integer>(); 
	    int difference= Integer.MAX_VALUE;
	    for(int i= 0; i< arr.length; i++)
	    {
	    	int diff = Math.abs(getDifference(x, arr[i]));
	    	
	    	if(diff < difference)
	    	{
	    		difference = diff;
	    		list.clear();
	    		list.add(arr[i]);
	    	}
	    	else if (diff == difference)
	    	{
	    		list.add(arr[i]);
	    	}
	    }
	    	
	    return list;
	}

	int getDifference(int a, int b)
	{
	    return a-b;
	 }
	public static void main(String[] args)
	{
		int[] arr= {1, 9, 6, 8, -2, 2, -6};
		ArrayList<Integer> result = new ClosestElement().searchClosestElement(4, arr);
		
		for(int i =0; i< result.size(); i++)
		{
			System.out.println(result.get(i));
		}

	}

}
