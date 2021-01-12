import java.util.*;
interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(final int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0)
                sum += i;
        }
        return sum;
    }

}

public class Day_19_Interfaces {
    public static void main(String []args){
        Calculator my_calculator = new Calculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
