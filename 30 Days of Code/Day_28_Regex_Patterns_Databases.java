import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day_28_Regex_Patterns_Databases {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int tests = scanner.nextInt();
        final Pattern pattern = Pattern.compile(".+@gmail\\.com$");
        final List<String> list = new ArrayList<>();
        for (int i = 0; i < tests; i++){
            final String name = scanner.next();
            final String email = scanner.next();
            final Matcher matcher = pattern.matcher(email);
            if (matcher.find())
                list.add(name);
        }
        Collections.sort(list);
        for (String name : list)
            System.out.println(name);
    }
}
