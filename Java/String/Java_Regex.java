import java.util.Scanner;

public class Java_Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }

}

// having a class outside the file class is poor Java coding!
// tests should not be doing this!!!
class MyRegex{

    String pattern = "^\\s*(?:(?:2[0-5][0-5]|2[0-4]\\d|1\\d\\d|0?\\d\\d|0?0?\\d)(\\.|$)){4}(?<!\\.)\\s*$";

}
