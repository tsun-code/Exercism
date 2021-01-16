import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        // Regular Expression Reference: 
        // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions
        // https://support.kobotoolbox.org/restrict_responses.html
        // https://www.regular-expressions.info/refmodifiers.html

        // There are two parts in my regular expressions:
        // First part ".*(?i)([a-z]).*\\1.*" is to test if the string has repeated characters.
        // Second part ".*(?i)[^a-z- ].*" is to test if the string has any character other than letters, hypern and space.
        // Either the evaluation of the first or second part is true, it is not an Isogram.
        return ! phrase.matches(".*(?i)([a-z]).*\\1.*|.*(?i)[^a-z- ].*");
    }
}
