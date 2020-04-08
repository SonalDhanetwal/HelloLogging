package com.Phoenix.HelloLogging;

import Controller.loginterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloLoggingApplication {

	private static final Logger logger = LoggerFactory.getLogger(HelloLoggingApplication.class);

		@GetMapping("/log")
		String HelloLog()
		{
			System.out.println("Happy Logging");
			return "Happy Logging!";
		}


	public static void main(String[] args) { SpringApplication.run(HelloLoggingApplication.class, args);
		logger.error("Message logged at Error Level");
		logger.warn("Message logged at warning level");
		logger.info("message logged at information level");
		logger.debug("Message logged at debug level");

	}


}
