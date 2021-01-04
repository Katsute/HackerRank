import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exception_Handling_Try_Catch {

    public static void main(String[] args) {
        final Scanner IN = new Scanner(System.in);
        try{
            System.out.println(IN.nextInt() / IN.nextInt());
        }catch(final InputMismatchException | ArithmeticException e){
            // test case FAILS to accept responses that also print the message
            // hotfix added because HackerRank test cases are defective
            System.out.println(
                e instanceof InputMismatchException
                ? "java.util.InputMismatchException"
                : "java.lang.ArithmeticException: / by zero"
            );
        }
    }

}
