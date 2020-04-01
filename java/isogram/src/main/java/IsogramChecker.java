import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        return ! phrase.matches(".*(?i)([a-z]).*\\1.*|.*(?i)[^a-z- ].*");
    }
}
