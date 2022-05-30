
import org.apache.log4j.*;



public class LoggerMain {

    Logger logger = LogManager.getLogger(LoggerMain.class);

    public void runLoggingTest() {
        logger.debug("Logging debug test");
        logger.info("Logging info test");
        logger.error("Logging error test");
        logger.warn("Logging warn test");
    }

    public static void main(String[] args) {
        LoggerMain logTest = new LoggerMain();
        logTest.runLoggingTest();
    }
}
