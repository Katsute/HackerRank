import java.util.*;

public class Java_Arraylist {

    // ARRAYS START AT 0!!! STOP WRITING PROBLEMS AS IF THEY START AT 1
    public static void main(String[] args){
        final Scanner IN = new Scanner(System.in);
        int tests = IN.nextInt();
        final List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < tests; i++){
            final List<Integer> li = new ArrayList<>();
            lists.add(li);
            final int size = IN.nextInt();
            for(int i1 = 0; i1 < size; i1++)
                li.add(IN.nextInt());
        }
        tests = IN.nextInt();
        for(int i = 0; i < tests; i++){
            try{
                System.out.println(lists.get(IN.nextInt()-1).get(IN.nextInt()-1));
            }catch(final Throwable e){
                System.out.println("ERROR!");
            }
        }
    }

}
