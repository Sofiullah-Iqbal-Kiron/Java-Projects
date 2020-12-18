// By my regex: It has passed 6 test cases out of 10. Damn!
// Accepted by this: ("<a\\shref=\"([^\"]++)\"([^<>]*)>(<\\w>)*([^<>]*)<"); form discussion.


package ReGex.Applications.Medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_links
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        int n = input.nextInt();
        for (int i = 0; i <= n; i++)
        {
            ///Pattern HTMLDetector = Pattern.compile("<a href=\"(.*?)\".*?>(.*?)((<.*/>)?)(<b>(.*?)</b>)?</a>");
            Pattern HTMLDetector = Pattern.compile("<a .*?href=\"(.*?)\".*?>(.*?)((<.*/>)?)(<b>(.*?)</b>)?</a>");
            String TotalHTML = input.nextLine();
            Matcher matcher = HTMLDetector.matcher(TotalHTML);
            while (matcher.find())
                System.out.println(matcher.group(1).trim() + '\u002C' + matcher.group(2));
        }
    }
}
