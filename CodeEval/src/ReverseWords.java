import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords 
{
	String reverse(String str)
	{
        String word[] = str.split(" ");
        //String reverseStr = "";
        StringBuffer reverseStr = new StringBuffer();
        for(int i= word.length - 1; i >= 0; i--)
        {
        	//reverseStr = reverseStr + word[i] + " ";
        	reverseStr.append(word[i]);
        	reverseStr.append(" ");
        	
        	
        }
        
        //reverseStr = reverseStr.toString().trim();
        return reverseStr.toString().trim();
		
	}
	
	 public static void main (String[] args) throws IOException {
		 	ReverseWords rw = new ReverseWords();
	        File file = new File("input1.txt");
	        BufferedReader buffer = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = buffer.readLine()) != null) {
	        	if(line.length() == 0)
	        	{
	        		continue;
	        	}
	            line = line.trim();
	            line = rw.reverse(line);
	    
	            System.out.println(line);
	            
	        }
	        buffer.close();
	    }

}
