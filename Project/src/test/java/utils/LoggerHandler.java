package utils;
 
import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class LoggerHandler {
    static {
        File logDir = new File("logs");
        if(!logDir.exists()){
            logDir.mkdirs();
        }
    }
    private final Logger log = LogManager.getLogger(LoggerHandler.class);
 
    public void logTrace(String msg) {
        log.trace(msg);
    }
 
    public void logDebug(String msg) {
        log.debug(msg);
    }
 
    public void logInfo(String msg) {
        log.info(msg);
    }
 
    public void logWarn(String msg) {
        log.warn(msg);
    }
 
    public void logError(String msg) {
        log.error(msg);
    }
 
    public void logFatal(String msg) {
        log.fatal(msg);
    }
}