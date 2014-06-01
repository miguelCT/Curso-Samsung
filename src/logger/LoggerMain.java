package logger;

public class LoggerMain {

	public static void main(String[] args) {
		LoggerSingleton logger= LoggerSingleton.getLoggerSingleton();
		logger.addLog("Esto es un log1");
		logger.addLog("Esto es un log2");
		System.out.println(logger.getLogs());
		logger.clear();
		System.out.println(logger.getLogs());

	}

}
