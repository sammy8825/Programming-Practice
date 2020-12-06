import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // for finding the sum of a particular hour glass
    static int sum(int[][] arr, int i, int j) {
        int s = 0, flag = 1;
        if (i + 3 <= 6 && j + 3 <= 6) {
            flag = 0;
            for (int k = j; k < j + 3; k++) {
                for (int l = i; l < i + 3; l++) {
                    if ((k == j + 1 && l == i) || (k == j + 1 && l == i + 2)) {
                    } else {
                        s += arr[k][l];
                    }
                }
            }
            return s;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    // For finding the hourglass with maximum sum
    static int maxSum(int[][] arr) {
        int l = 0, k = 0, i, j;
        ArrayList<Integer> hrSum = new ArrayList<Integer>();

        while (k >= 0 && k <= 5) {

            while (l >= 0 && l <= 5) {
                i = l;
                j = k;

                // adds the sum of hourglasses into an arrayList
                hrSum.add(sum(arr, i, j));

                l++;
            }

            k++;
            l = 0;
        }

        // Sort the Array List
        Collections.sort(hrSum);

        return hrSum.get(hrSum.size() - 1);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(maxSum(arr));

        scanner.close();
    }
}
