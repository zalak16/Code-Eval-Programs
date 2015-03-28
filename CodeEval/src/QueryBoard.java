import java.io.*;
import java.util.*;
public class QueryBoard 
{
	final static String QUERYCOL = "QueryCol";
	final static String SETCOL = "SetCol";
	final static String SETROW = "SetRow";
	final static String QUERYROW="QueryRow";
	int board[][] = new int[256][256];
	
	
	void modifyRow(int rowNum, int val)
	{
		for(int j= 0; j< 256; j++)
		{
			board[rowNum][j] = val;
		}
	}
	
	void modifyCol(int colNum, int val)
	{
		for(int i= 0; i< 256; i++)
		{
			board[i][colNum] = val;
		}
	}
	
	void printRowSum(int rowNum)
	{
		int sum = 0;
		for(int j=0; j<256; j++)
		{
			sum = sum + board[rowNum][j];
		}
		System.out.println(sum);
	}
	
	void printColSum(int colNum)
	{
		int sum = 0;
		for(int i=0; i<256; i++)
		{
			sum = sum + board[i][colNum];
		}
		System.out.println(sum);
	}
	
	public static void main(String args[])
	{
		QueryBoard qb = new QueryBoard();
		int row, col, x;
		
		try
		{
			File file = new File("input9.txt");//args[0]);
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String action = scanner.next();
				switch(action)
				{
					case QUERYCOL:
						col = scanner.nextInt();
						qb.printColSum(col);
					break;
					
					case QUERYROW:
						row = scanner.nextInt();
						qb.printRowSum(row);
					break;
					
					case SETCOL:
						col = scanner.nextInt();
						x = scanner.nextInt();
						qb.modifyCol(col, x);
					break;
						
					case SETROW:
						row = scanner.nextInt();
						x = scanner.nextInt();
						qb.modifyRow(row, x);
					break;
						
				}
				
			}
			scanner.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
