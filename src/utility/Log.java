package utility;

import org.apache.log4j.Logger;

public class Log {

	public static Logger Log = Logger.getLogger(Log.class.getName());
	
	public static void startTestCase(String message) {
		Log.info("=================================");
		Log.info("=========" + message + "=========");
		Log.info("=================================");
	}
	
	public static void endTestCase() {
		Log.info("=================END================");
	}
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void error(String message) {
		Log.error(message);
	}
}