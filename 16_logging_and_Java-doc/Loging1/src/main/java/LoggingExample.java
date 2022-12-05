import java.util.logging.Level;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger("lt.mokymai");
        Logger logger2 = Logger.getLogger("lt.mokymai.logging");
        Logger logger3 = Logger.getLogger("lt.mokymai.logging.inherited");

        logger1.log(Level.INFO, "Pirmas įvykis {0} - {1}", new Object[] {"A", "B"});
        logger1.info("Tai yra spam");
        logger1.log(Level.SEVERE, "Antras įvykis", new Exception("Klaida"));
        logger1.fine("Trečias įvykis");

        // Galima nurodyti kitą įvykio šaltinio klasę bei metodą
        logger2.logp(Level.INFO, "AnotherClass", "nonMain", "Pirmas įvykis");
        logger2.info("Tai yra spam");
        logger2.severe("Antras įvykis");
        logger2.fine("Trečias įvykis");

        logger3.info("Pirmas įvykis");
        logger3.info("Tai yra spam");
        logger3.log(Level.SEVERE, "Antras įvykis", new Exception("Klaida"));
        logger3.fine("Trečias įvykis");
    }
}