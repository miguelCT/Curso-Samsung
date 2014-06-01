package Patrones.Singleton.logger;

import java.util.Date;

import upm.jbb.IO;

public class LoggerSingleton {
	private static LoggerSingleton logger= new LoggerSingleton();
	private String logs;

	private LoggerSingleton(){
		this.clear();
	}
	
	public static LoggerSingleton getLoggerSingleton(){
		return LoggerSingleton.logger;
	}

	public String getLogs() {
		return logs;
	}

	public void addLog(String log) {
		this.logs = this.logs + ">>> " + log + "\n";
	}

	public void clear() {
		this.logs = new Date().toString() + "\n";
	}

	public void print() {
		IO.out.print(this.logs);
	}
}