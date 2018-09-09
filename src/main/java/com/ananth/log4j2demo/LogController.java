package com.ananth.log4j2demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This control is to demonstrate logging
 */
@RestController
public class LogController {

    private static Logger logger = LogManager.getLogger();
    @RequestMapping("/")
    String hello(){
        //log message will be logged based on the configuration mentioned in resource/log4j2.xml
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
        return "Done";
    }
}
