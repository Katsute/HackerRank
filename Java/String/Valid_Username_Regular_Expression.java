import java.util.Scanner;

// HAVING CLASSES OUTSIDE OF THE FILE CLASS IS BAD CODING PRACTICE
// HACKERRANK SHOULD NOT BE CODING THIS WAY
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}

public class Valid_Username_Regular_Expression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}