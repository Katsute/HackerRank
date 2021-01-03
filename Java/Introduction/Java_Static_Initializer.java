import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Static_Initializer {

    private static final Scanner IN = new Scanner(System.in);

    private static final int B = IN.nextInt();
    private static final int H = IN.nextInt();
    private static final boolean flag = B > 0 && H > 0;

    static{
        if(!flag)
            try{
                throw new Exception("Breadth and height must be positive");
            }catch(Exception e){
                System.out.println(e); // question fails to specify you must print exception
            }
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}//end of main

}//end of class

