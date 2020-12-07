import java.io.*;
import java.util.*;

public class Solution {
    static String primeOrNot(int n){
        if(n == 1 || (n % 2 == 0 && n != 2)){
            return "Not prime";
        }else{
            for(int i = 3 ; i*i <= n ; i+=2){
                if(n % i == 0){
                    return "Not prime";
                }
            }
            return "Prime";
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- > 0){
            int num = scan.nextInt();
            System.out.println(primeOrNot(num));
        }
    }
}