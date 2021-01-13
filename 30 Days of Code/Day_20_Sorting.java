import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_20_Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numberOfSwaps = 0;
        final int len = a.length;
        for(final int i : a){
            for(int j = 0; j < len - 1; j++){
                int first = a[j];
                int second = a[j+1];
                if(first > second){
                    a[j] = second;
                    a[j+1] = first;
                    numberOfSwaps++;
                }
            }

            if(numberOfSwaps == 0)
                break;
        }

        System.out.printf("Array is sorted in %d swaps.\n", numberOfSwaps);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d", a[len-1]);
    }
}