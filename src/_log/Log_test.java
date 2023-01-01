package _log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log_test {
    public static final Logger LOGGER = LoggerFactory.getLogger("Log_test.class");
    public static void main(String[] args) {
        LOGGER.debug("aaaaaa");
        LOGGER.info("bbbbbbbb");
        int a = 0;
        int b = 1321;
    }
}
