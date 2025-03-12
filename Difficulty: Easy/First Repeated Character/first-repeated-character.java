//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(a.containsKey(s.charAt(i))){
                return ""+s.charAt(i);
            }
            else{
                a.put(s.charAt(i),0);
            }
        }
        return "-1";
    }
} 