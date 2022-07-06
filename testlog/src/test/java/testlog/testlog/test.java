package testlog.testlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class test {
	
	public static Logger logger = LogManager.getLogger(test.class);
	@Test
	public void demo() {
		logger.info("this is a demo");
		logger.info("working as expected");
		logger.warn("warning message");
		logger.fatal("this is a fatal");
		logger.error("this is a error");
		System.out.println("task is working test");
		System.out.println("hello");
		
		System.out.println(" hello testing");

	}
	

}
