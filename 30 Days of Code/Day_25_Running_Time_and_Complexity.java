import java.io.*;
import java.util.*;

public class Day_25_Running_Time_and_Complexity {

    public static void main(String[] args) {
        final Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        final List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < T; i++)
            nums.add(sc.nextInt());

        OUT:
        for(final Integer num : nums){
            if(num == 0 || num == 1 || num %2 == 0 && num != 2) // 1 and evens are not prime
                System.out.println("Not prime");
            else{
                for(int i = 2; i*i <= num; i++)
                    if(num%i == 0){
                        System.out.println("Not prime");
                        continue OUT;
                    }
                System.out.println("Prime");
            }
        }
    }
}