package com.Phoenix.HelloLogging;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloService {
    private Logger logger = LoggerFactory.getLogger(HelloService.class);
    public void service()
    {
        logger.info("Message at infoLevel from HelloService.Service()");
        logger.warn("Message at warning level from HelloService.service()");
        logger.error("Message at error level from HelloService.service");
    }
}
