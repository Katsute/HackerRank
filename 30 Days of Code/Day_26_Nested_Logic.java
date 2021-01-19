import java.io.*;
import java.util.*;

public class Day_26_Nested_Logic {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String[] returned = scanner.nextLine().split(" ");
        final String[] due = scanner.nextLine().split(" ");

        final Date returnedDate = new GregorianCalendar(
            Integer.parseInt(returned[2]),
            Integer.parseInt(returned[1]) - 1,
            Integer.parseInt(returned[0])
        ).getTime();

        final Date dueDate = new GregorianCalendar(
            Integer.parseInt(due[2]),
            Integer.parseInt(due[1]) - 1,
            Integer.parseInt(due[0])
        ).getTime();

        final long diff = dueDate.getTime()-returnedDate.getTime();

        if(diff >= 0)
            System.out.println('0');
        else if(returnedDate.getMonth() == dueDate.getMonth()){
            System.out.println(15 * (returnedDate.getDate() - dueDate.getDate()));
        }else if(returnedDate.getYear() == dueDate.getYear())
            System.out.println(500 * (returnedDate.getMonth() - dueDate.getMonth()));
        else
            System.out.println("10000");

    }
}