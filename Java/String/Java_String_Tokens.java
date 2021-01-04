import java.util.Scanner;

public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim(); // hotfix for poor problem explanation

        final String[] tokens = s.split("[ !,?._'@]+");

        if(s.length() == 0) // hotfix for poor problem explanation
            System.out.println(0);
        else if(tokens.length <= 400000){
            System.out.println(tokens.length);
            for(final String s1 : tokens)
                System.out.println(s1);
        }
        scan.close();
    }

}
