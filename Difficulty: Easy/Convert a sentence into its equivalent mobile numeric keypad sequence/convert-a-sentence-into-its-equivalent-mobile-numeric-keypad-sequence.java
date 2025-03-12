//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        // code here
        String ans="";
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='A'){ans+="2";}
            else if(ch=='B'){ans+="22";}
            else if(ch=='C'){ans+="222";}
            else if(ch=='D'){ans+="3";}
            else if(ch=='E'){ans+="33";}
            else if(ch=='F'){ans+="333";}
            else if(ch=='G'){ans+="4";}
            else if(ch=='H'){ans+="44";}
            else if(ch=='I'){ans+="444";}
            else if(ch=='J'){ans+="5";}
            else if(ch=='K'){ans+="55";}
            else if(ch=='L'){ans+="555";}
            else if(ch=='M'){ans+="6";}
            else if(ch=='N'){ans+="66";}
            else if(ch=='O'){ans+="666";}
            else if(ch=='P'){ans+="7";}
            else if(ch=='Q'){ans+="77";}
            else if(ch=='R'){ans+="777";}
            else if(ch=='S'){ans+="7777";}
            else if(ch=='T'){ans+="8";}
            else if(ch=='U'){ans+="88";}
            else if(ch=='V'){ans+="888";}
            else if(ch=='W'){ans+="9";}
            else if(ch=='X'){ans+="99";}
            else if(ch=='Y'){ans+="999";}
            else if(ch=='Z'){ans+="9999";}
            else{ans+="0";}
        }
        return ans;
       

    }
}