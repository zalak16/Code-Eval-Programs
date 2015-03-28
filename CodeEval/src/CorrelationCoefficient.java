import java.io.*;
import java.util.*;
public class CorrelationCoefficient
{
	int[] maths; 
	int[] ph;
	int[] ch;
	int n;
	
	void read(String filename)
	{
		try
		{
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		int linenumber =0;
		int index = 0;
		while(scanner.hasNext())
		{
			linenumber++;
			if(linenumber == 1)
			{
				n = scanner.nextInt();
				maths = new int[n];
				ph = new int[n];
				ch = new int[n];
				
			}
			else
			{
				maths[index] = scanner.nextInt();
				ph[index] = scanner.nextInt();
				ch[index] = scanner.nextInt();
				index++;
				
				if(index >n)
				{
					System.out.println("N is exceeding");
				}
			}
			
		}
		scanner.close();
		//validate(maths);
		//validate(ph);
		//validate(ch);
		}
		catch(Exception ex)
		{
			
		}
	}
	
	
	int calculateSummation(int []arr)
	{
		int sum = 0;
		for(int i= 0; i< n; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
	
	int calculatePairSummation(int []arr1, int[]arr2)
	{
		int sum = 0;
		for(int i= 0; i< n; i++)
		{
			sum = sum + (arr1[i] * arr2[i]);
		}
		return sum;
	}
	
	int calculateSquareSummation(int []arr1)
	{
		int sum = 0;
		for(int i= 0; i< n; i++)
		{
			sum = sum + (arr1[i] * arr1[i]);
		}
		return sum;
	}
	
	double calculateDividend(int[] arr1, int []arr2)
	{
		int pairSummation = calculatePairSummation(arr1, arr2);
		int arr1_summation = calculateSummation(arr1);
		int arr2_summation = calculateSummation(arr2);
		int product_singleSummation = arr1_summation * arr2_summation;
		
		return ((n * pairSummation) - (product_singleSummation));
	}

	double calculateDivisor(int[] arr1, int []arr2)
	{
		int arr1_square_summation = calculateSquareSummation(arr1);
		int arr2_square_summation = calculateSquareSummation(arr2);
		
		double arr1_summation_square = Math.pow(calculateSquareSummation(arr1), 2);
		double arr2_summation_square = Math.pow(calculateSquareSummation(arr2), 2);
		
		double arr1_squareroot = Math.sqrt((n * arr1_square_summation) - arr1_summation_square);
		double arr2_squareroot = Math.sqrt((n * arr2_square_summation) - arr2_summation_square);
		
		return (arr1_squareroot * arr2_squareroot);
		
		
	}
	
	double correlation(int arr1[], int arr2[])
	{
		return ((calculateDividend(arr1, arr2)) / (calculateDivisor(arr1, arr2)));
	}
	
	
	public static void main(String[] args)
	{
		CorrelationCoefficient obj = new CorrelationCoefficient();
		obj.read(args[0]);
		System.out.println(obj.correlation(obj.maths, obj.ph));
		System.out.println(obj.correlation(obj.ph, obj.ch));
		System.out.println(obj.correlation(obj.maths, obj.ch));

	}
}
