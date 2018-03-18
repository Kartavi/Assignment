package Assignment;

public class Parenthesis {

	 static void printParenthesis(char str[], int ele, int n, int open, int close)
	    {
	        if(close == n) 
	        {
	            for(int i=0;i<str.length;i++)
	                System.out.print(str[i]);
	            System.out.println();
	            return;
	        }
	        else
	        {
	            if(open > close) {
	                str[ele] = ')';
	                printParenthesis(str, ele+1, n, open, close+1);
	            }
	            if(open < n) {
	                str[ele] = '(';
	                printParenthesis(str, ele+1, n, open+1, close);
	            }
	        }
	    }
	     
	     
	    public static void main (String[] args) 
	    {
	        int n = 5;
	        int open=0, close=0;
	        int ele=0;
	        int aLength=n*2;
	        char[] str = new char[aLength];
	        printParenthesis(str, ele, n, open, close);
	    }
	}
	
	

