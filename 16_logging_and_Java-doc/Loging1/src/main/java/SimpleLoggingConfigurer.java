import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

public class SimpleLoggingConfigurer {

    public SimpleLoggingConfigurer() throws IOException{
        LogManager logManager = LogManager.getLogManager();
        try (InputStream is = this.getClass().getResourceAsStream("/logging.propertie")) {
            logManager.readConfiguration(is);
        }
    }

}