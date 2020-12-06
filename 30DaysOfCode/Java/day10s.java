import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    // To find the number of consecutive 1's
    static int consecutiveOne(Stack<Integer> st){ 
        int count = 0, flag = 0;
        while (!st.isEmpty()){
            if(st.pop() == 1){
                flag ++;
            }else{
                count = count < flag ? flag : count;
                flag = 0;
            }
        }
        count = count < flag ? flag : count;
        return count;
    }

    //To convert the number into binary
    static int toBinary(int n){ 
        Stack<Integer> st = new Stack<Integer>();
        int num = n;
        while(num > 0){
            st.push(num % 2);
            num /= 2;
        }
    
        return consecutiveOne(st);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println(toBinary(n));

        scanner.close();
    }
}
