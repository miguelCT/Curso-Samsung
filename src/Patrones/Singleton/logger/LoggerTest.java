package Patrones.Singleton.logger;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class LoggerTest {
	@Test
	public void testIsSingleton() {
		assertSame("No es la misma referencia", LoggerSingleton.getLoggerSingleton(),
				LoggerSingleton.getLoggerSingleton());
	}

	@Test
	public void testSingletonNotNull() {
		assertNotNull(LoggerSingleton.getLoggerSingleton());
	}
}