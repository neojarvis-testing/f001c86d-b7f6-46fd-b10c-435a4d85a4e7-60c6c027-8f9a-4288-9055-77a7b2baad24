package utils;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class LoggerHandler {
    private static final Logger log = LogManager.getLogger(LoggerHandler.class);
 
    public static void logTrace(String msg) {
        log.trace(msg);
    }
 
    public static void logDebug(String msg) {
        log.debug(msg);
    }
 
    public static void logInfo(String msg) {
        log.info(msg);
    }
 
    public static void logWarn(String msg) {
        log.warn(msg);
    }
 
    public static void logError(String msg) {
        log.error(msg);
    }
 
    public static void logFatal(String msg) {
        log.fatal(msg);
    }
}