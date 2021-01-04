import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content_Extractor {

    public static void main(String[] args){

        final Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();

          	final Matcher matcher = pattern.matcher(line);

          	if(!matcher.find())
                System.out.println("None");
          	else{
                matcher.reset(line);
                while(matcher.find())
                    System.out.println(matcher.group(2));
            }
			testCases--;
		}
	}

}
