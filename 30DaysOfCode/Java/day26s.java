import java.io.*;
import java.util.*;

public class Solution {
    
    static int fine(int d1,int m1,int y1,int d2,int m2,int y2){
        int fine = 0;
        if(y1 == y2 && m1 == m2 && d1 > d2){
            fine = 15 * (d1 - d2);
        }else if(y1 == y2 && m1 > m2){
            fine = 500 * (m1 - m2);
        }else if(y1 > y2){
            fine = 10000;
        }
        return fine;        
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int y1 = scan.nextInt();
        
        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int y2 = scan.nextInt();
        
        System.out.println(fine(d1,m1,y1,d2,m2,y2));
        
    }
}
