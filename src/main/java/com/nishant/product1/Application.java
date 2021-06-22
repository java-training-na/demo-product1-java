package com.nishant.product1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		logger
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warning message");
		logger.error("This is an error message");
	}
}
