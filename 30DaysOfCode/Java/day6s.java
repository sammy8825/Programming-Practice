import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String splitter(String str){
        String even = "";
        String odd =  "";
        
        for(int i = 0 ; i < str.length(); i++){
            char s = str.charAt(i);
            if(i % 2 == 0){
                even += s;
            }else{
                odd += s;
            }
        }
        
        return (even + " " + odd);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int T;
        Scanner sc = new Scanner(System.in);
        
        T = sc.nextInt();
        
        for(int i = 0 ; i < T ; i++){
            String s = sc.next();
            
            System.out.println(splitter(s));
        }
    }
}
