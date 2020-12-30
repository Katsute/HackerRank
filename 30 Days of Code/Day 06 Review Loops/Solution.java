import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int T = scanner.nextInt();
        scanner.nextLine(); // Hackerrank has unexplained dandling input
        for(int i = 0; i < T; i++){
            final String IN = scanner.nextLine();

            final List<Character> even = new ArrayList<>();
            final List<Character> odd = new ArrayList<>();

            final char[] arr = IN.toCharArray();
            final int size = arr.length;
            for(int i2 = 0; i2 < size; i2++)
                if(i2 % 2 == 0)
                    even.add(arr[i2]);
                else
                    odd.add(arr[i2]);
            final StringBuilder OUT = new StringBuilder();
            for(final Character character : even)
                OUT.append(character);
            OUT.append(' ');
            for(final Character character : odd)
                OUT.append(character);
            System.out.println(OUT.toString());
        }
    }
}