import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_11_2D_Arrays {



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

        int max = Integer.MIN_VALUE; // fixes defective case 3, 7
        for(int c = 0; c < 4; c++){
            for(int r = 0; r < 4; r++){
                int sum =
                    arr[r]  [c] + arr[r]  [c+1] + arr[r]  [c+2] +
                                + arr[r+1][c+1] +
                    arr[r+2][c] + arr[r+2][c+1] + arr[r+2][c+2];
                if(sum > max)
                    max = sum;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}
