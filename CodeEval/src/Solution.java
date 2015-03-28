import java.io.*;
import java.util.*;
public class Solution {
   int s_row, s_col;
   int t_row, t_col;
   int total_nut;
   int []n_row;
   int []n_col;
   int grid [][] = new int[2][3];
   int iteration = 0;
  int calculateIteration()
  {
	  int iteration = 0;
	  int n = total_nut;
	  int row_index = 0;
	  int col_index= 0;
	  
	  while(n!= 0)
	  {
		  for(int i = 0 ;i <2; i++)
		  {
			  for(int j = 0 ; j< 3; j++)
			  {
				  iteration ++;
				  nextStep();
				 if(i == n_row[row_index] && j == n_col[col_index])
				 {
					
					 n--;
					col_index++;
				 }
			  }
			  row_index++;
		  }
	  }
	  return iteration;
  }
   
   void nextStep()
   {
	   int[] step = calculateDistance();
	   s_row = step[0];
	   s_col = step[1];
	   
	   moveToTree();
	   
   }
   
   void moveToTree()
   {
	   s_row = t_row;
	   s_col = t_col;
		
   }
   
   int[] calculateDistance()
   {
	   int row_difference= Integer.MAX_VALUE;
	   int col_difference = Integer.MAX_VALUE;
	   
	   int row_index = -1, col_index = -1; 
	  for(int i= 0; i<total_nut; i++)
	  {
		  
		if(row_difference > Math.abs(n_row[i] - s_row))
		{
			row_difference = Math.abs(n_row[i] - s_row);
		}
		if(col_difference > Math.abs(n_col[i] - s_col))
		{
			col_difference = Math.abs(n_col[i] - s_col);
		}
		
		if(row_difference < col_difference)
		{
			
			row_index = n_row[i];
		    col_index = n_col[i];
		}
		else if(col_difference < row_difference)
		{
			
			row_index = n_row[i];
		    col_index = n_col[i];
			
		}
		else
		{
			if(n_row[i] < s_row)
			{
				row_index = n_row[i];
			}
			else if(n_row[i] > s_row)
			{
				row_index = n_row[i];
			}
			else if(n_col[i] < s_col)
			{
				col_index = n_col[i];
			}
			else if(n_col[i] > s_col)
			{
				col_index = n_col[i];
			}
		}
		  
	  }
	  
	  return new int[] {row_index, col_index};
   }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Solution sol = new Solution();
         Scanner scanner = new Scanner(System.in);
        int line = 0;
        int index =0;
        while(scanner.hasNext())
        {
            line++;
            if(line == 1)
            {
               sol.s_row = scanner.nextInt();
               sol.s_col = scanner.nextInt();
            }
            else if(line == 2)
            {
            	sol.t_row = scanner.nextInt();
            	sol.t_col = scanner.nextInt();
            }
            else if(line ==3)
            {
            	sol.total_nut = scanner.nextInt();
            	sol.n_row = new int[sol.total_nut];
            	sol.n_col = new int[sol.total_nut];
            }
            else
            {
            	sol.n_row[index] = scanner.nextInt();
            	sol.n_col[index] = scanner.nextInt();
            	index++;
            }
            
        }
    
        scanner.close();
        
        System.out.println(sol.calculateIteration());
         
    }
}