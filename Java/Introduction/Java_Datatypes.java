import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Datatypes {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final short tests = scanner.nextShort();

        for(short i = 0; i < tests; i++){
            final String IN = scanner.next();
            try{
                final long num = Long.parseLong(IN);
                System.out.println(num + " can be fitted in:");

                if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");
                if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");
            }catch(final Throwable e){
                System.out.println(IN + " can't be fitted anywhere.");
            }
        }
    }

}
