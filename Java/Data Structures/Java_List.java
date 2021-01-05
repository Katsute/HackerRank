import java.util.*;

public class Java_List {

    public static void main(String[] args){
        final Scanner IN = new Scanner(System.in);
        final int size = IN.nextInt();
        final List<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++)
            list.add(IN.nextInt());

        final int commands = IN.nextInt();
        for(int i = 0; i < commands; i++){
            switch(IN.next()){
                case "Insert":
                    list.add(IN.nextInt(), IN.nextInt());
                    break;
                case "Delete":
                    list.remove(IN.nextInt());
                    break;
            }
        }
        final StringBuilder OUT = new StringBuilder();
        for(final Integer integer : list){
            OUT.append(integer).append(' ');
        }
        if(OUT.length() > 0)
            OUT.deleteCharAt(OUT.length()-1);
        System.out.println(OUT);
    }

}
