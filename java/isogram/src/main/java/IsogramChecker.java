import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        // Regular Expression Reference: 
        // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions
        // https://support.kobotoolbox.org/restrict_responses.html
        // https://www.regular-expressions.info/refmodifiers.html
        return ! phrase.matches(".*(?i)([a-z]).*\\1.*|.*(?i)[^a-z- ].*");
    }
}
