//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Day_08_Maps_And_Dictionaries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        final Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(map.containsKey(s) ? s + '=' + map.get(s) : "Not found");
        }
        in.close();
    }
}
