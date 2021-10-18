package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerMenager;

public class JLoggerMenagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerMenager menager = new JLoggerMenager();
		menager.log(message);

	}

}
