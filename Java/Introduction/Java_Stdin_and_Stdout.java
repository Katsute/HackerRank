import java.util.Scanner;

public class Java_Stdin_and_Stdout {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++)
            System.out.println(scanner.next());
    }

}
