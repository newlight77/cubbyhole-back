package com.kata.cubbyhole.config.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.logging.LogLevel;

public class LogWriter {


    public static void write(Class clazz, LogLevel logLevel, String message) {

        Logger logger = LoggerFactory.getLogger(clazz);

        switch (logLevel) {
            case TRACE:
                logger.trace(message);
                break;
            case DEBUG:
                logger.debug(message);
                break;
            case WARN:
                logger.warn(message);
                break;
            case ERROR:
                logger.error(message);
                break;
            case INFO:
            default:
                logger.info(message);
                break;
        }
    }

}