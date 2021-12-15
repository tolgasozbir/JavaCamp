package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdater implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager=new JLoggerManager();
        jLoggerManager.log(message);
    }
}
