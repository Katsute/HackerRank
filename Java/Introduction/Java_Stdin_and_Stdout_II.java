import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        final int i = scanner.nextInt();
        final double d = scanner.nextDouble();
        scanner.nextLine(); // fix before not consuming new line
        final String str = scanner.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
