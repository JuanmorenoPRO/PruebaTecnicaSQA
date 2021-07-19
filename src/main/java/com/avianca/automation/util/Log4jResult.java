package com.avianca.automation.util;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jResult {

    public void initializeComponent(){
        PropertyConfigurator.configure("resources/logconfig/log4j.properties");
    }

    private static final Logger log = Logger.getLogger(Log4jResult.class);
     public static void flightResult(){
         log.debug("Hola Mundo");
     }

}
