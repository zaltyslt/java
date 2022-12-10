package tcom.kmkyong;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//https://mkyong.com/logging/slf4j-logback-tutorial/

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Logback");
//
//        logger.debug("getNumber() : {}", getNumber());
//        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
//        logger.debug("get config: {}",
//                ConfigurationWatchListUtil.getConfigurationWatchList(context).getCopyOfFileWatchList().get(0));
//
//        try {
//           throw new IllegalArgumentException("Sorry IllegalArgumentException!");
//        } catch (IllegalArgumentException e) {
//            logger.error("{}", e.toString());
//        }
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        // print logback's internal status
//        StatusPrinter.print(lc);

    }

    static int getNumber() {
        return 5;
    }

}