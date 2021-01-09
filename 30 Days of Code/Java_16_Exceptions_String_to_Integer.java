import java.util.Scanner;

public class Java_16_Exceptions_String_to_Integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            System.out.println(Integer.parseInt(S));
        }catch(final NumberFormatException ignored){
            System.out.println("Bad String");
        }
    }

}
