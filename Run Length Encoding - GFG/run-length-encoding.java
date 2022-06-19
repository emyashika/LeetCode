// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          String res = "";
        for (int i = 0; i < str.length();) {
            char ch = str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    count++;
                else
                    break;
            }
            res += String.valueOf(ch) + String.valueOf(count);
            i += count;
        }
        return res;
	}
	
 }