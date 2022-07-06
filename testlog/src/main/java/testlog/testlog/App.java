package testlog.testlog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public Logger logger = LogManager.getLogger(App.class);
    @Test
    public void login()
    {
    	logger.info("its working");
    }
}
