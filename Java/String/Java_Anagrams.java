import java.util.Scanner;

public class Java_Anagrams {

    static boolean isAnagram(String a, String b){
        final String al = a.toLowerCase();
        final String bl = b.toLowerCase();
        for(final char c : al.toCharArray())
            if(countOccurrences(al, c) != countOccurrences(bl, c))
                return false;
        for(final char c : bl.toCharArray())
            if(countOccurrences(al, c) != countOccurrences(bl, c))
                return false;
        return true;
    }

    static int countOccurrences(final String a, final char c){
        int count = 0;
        for(final char c1 : a.toCharArray())
            if(c1 == c)
                count++;
        return count;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
