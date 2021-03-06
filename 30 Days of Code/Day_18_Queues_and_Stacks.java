import java.io.*;
import java.util.*;

public class Day_18_Queues_and_Stacks {
    // Write your code here.

    final List<Character> stack = new ArrayList<>();
    final List<Character> queue = new ArrayList<>();

    void pushCharacter(final char ch){
        stack.add(ch);
    }

    void enqueueCharacter(final char ch){
        queue.add(ch);
    }

    char popCharacter(){
        return stack.remove(stack.size() - 1);
    }

    char dequeueCharacter(){
        return stack.remove(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_and_Stacks p = new Day_18_Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}