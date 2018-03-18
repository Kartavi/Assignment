package Assignment;

import java.util.ArrayList;

public class PalindromeSubstring {
	static boolean isPalindrome(String checkStr)
    {
        int l = checkStr.length();
        l--;
        for (int i=0; i<l; i++)
        {
            if (checkStr.charAt(i) != checkStr.charAt(l))
                return false;
            l--;
        }
        return true;
    }
    static void printSubstring(ArrayList<ArrayList<String>>  partitions)                                      
    {
        for(ArrayList<String> i: partitions)
        {
            for(String j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    static ArrayList<ArrayList<String>> addStrings(ArrayList<
       ArrayList<String>> v, String s, ArrayList<String> temp, 
                                             int index)
    {
        int l = s.length();
        String checkStr = "";
        ArrayList<String> current = new ArrayList<>(temp);
         
        if (index == 0)
            temp.clear();
        for (int i = index; i < l; ++i)
        {
            checkStr = checkStr + s.charAt(i);
            if (isPalindrome(checkStr))
            {
                temp.add(checkStr);
                 
                if (i + 1 < l)
                {    
                    v = addStrings(v,s,temp,i+1);
                }
                else
                {
                    v.add(temp);
                }
                 
                temp = new ArrayList<>(current);
            }
        }
        return v;
    }
      
    static void partition(String s, ArrayList<ArrayList<
                                          String>> v)
    {
        
        ArrayList<String> temp = new ArrayList<>();
        
        v = addStrings(v, s, temp, 0);
        printSubstring(v);
    }
      
   
    public static void main(String args[])
    {
        String s = "nitin";
        ArrayList<ArrayList<String>> partitions = new
                                           ArrayList<>();
        partition(s, partitions);
    }
	
	
	
	
}
