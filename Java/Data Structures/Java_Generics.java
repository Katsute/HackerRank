import java.io.IOException;
import java.lang.reflect.Method;

// KEEPING CLASS OUTSIDE OF FILE CLASS IS POOR CODING PRACTICE
class Printer
{
   //Write your code here
    void printArray(final Object[] arr){
        for(final Object o : arr){
            System.out.println(o.toString());
        }
    }
}

public class Java_Generics {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}