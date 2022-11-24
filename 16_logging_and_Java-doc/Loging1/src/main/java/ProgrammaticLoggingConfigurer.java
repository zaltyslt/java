import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ProgrammaticLoggingConfigurer {

    public ProgrammaticLoggingConfigurer() throws IOException {
        LogManager logManager = LogManager.getLogManager();

        SpamFilter spamFilter = new SpamFilter();
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%4$-8s][%3$-30s][%2$-30s][%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS]: %5$s%6$s%n");
        SimpleFormatter formatter = new SimpleFormatter();

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFilter(spamFilter);
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(formatter);
        
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFilter(spamFilter);
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(formatter);

        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.INFO);
        rootLogger.addHandler(consoleHandler);
        rootLogger.addHandler(fileHandler);
        logManager.addLogger(rootLogger);

        Logger logger = Logger.getLogger("lt.mokymai.logging");
        logger.setLevel(Level.ALL);
        logManager.addLogger(logger);
    }

}