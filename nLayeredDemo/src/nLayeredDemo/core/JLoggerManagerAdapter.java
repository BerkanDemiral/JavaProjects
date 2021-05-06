package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager menager = new JLoggerManager();
		menager.log(message);
		
	}

}
