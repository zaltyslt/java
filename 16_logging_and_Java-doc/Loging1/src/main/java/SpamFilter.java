import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Atfiltruoja tuos pranešimus, kurie savyje turi teksto fragmentą SPAM arba spam.
 */
public class SpamFilter implements Filter {

    public boolean isLoggable(LogRecord record) {
        String message = record.getMessage();
        
        return !message.contains("spam") && !message.contains("SPAM");
    }

}