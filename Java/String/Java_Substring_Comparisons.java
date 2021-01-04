import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = null;
        String largest = null;

        final int size = s.length() - k + 1;
        for(int i = 0; i < size; i++){
            final String sub = s.substring(i, i+k);
            if(smallest == null || sub.compareTo(smallest) < 0)
                smallest = sub;
            if(largest == null || sub.compareTo(largest) > 0)
                largest = sub;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
