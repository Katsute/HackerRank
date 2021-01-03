import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_10_Binary {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final String bin = Integer.toBinaryString(n);

        final Pattern pattern = Pattern.compile("1+");
        final Matcher matcher = pattern.matcher(bin);
        int max = 0;
        while(matcher.find()){
            if(matcher.group(0).length() > max)
                max = matcher.group(0).length();
        }
        System.out.println(max);

        scanner.close();
    }
}
