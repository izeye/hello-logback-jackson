package com.izeye.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world for Logback Jackson.
 *
 * @author Johnny Lim
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("jsonLogger");
        logger.debug("Hello,\nworld!");
    }

}
