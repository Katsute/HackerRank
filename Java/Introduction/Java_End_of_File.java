import java.util.Scanner;

public class Java_End_of_File {

    public static void main(String[] args){
        final Scanner IN = new Scanner(System.in);
        String s;
        int linos = 1;
        while(IN.hasNext())
            System.out.println(linos++ + " " + IN.nextLine());
    }
}
