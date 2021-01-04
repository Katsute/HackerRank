import java.util.Scanner;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String R = "";
        for(final char c : A.toCharArray())
            R = c + R;
        System.out.println(A.equals(R) ? "Yes" : "No");
    }

}
