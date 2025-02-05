import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {
    // regex find method
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String re = "[A-Za-z0-9]";

    Pattern expression = Pattern.compile(sc.nextLine());
    System.out.println(expression.pattern());
    System.out.println("Enter text");
    Matcher match = expression.matcher(sc.nextLine());
    System.out.println(match.pattern());

    boolean found = false;
    while (match.find()) {
        System.out.println("founded match at " + match.group() + " at starting index " + match.start() + " and end index " + match.end());
        found = true;
    }
    if (!found) {
        System.out.println("not found");
    }
}
}
