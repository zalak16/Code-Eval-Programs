import java.io.*;

public class UglyNumber
{
	int []singleDigitPrime = {2,3, 5, 7};
	
	boolean uglyNumber(int num)
	{
		for(int i= 0; i< singleDigitPrime.length; i++)
		{
			if(num % singleDigitPrime[i] == 0)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	

}
