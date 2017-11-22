//创建不同的记录器，赋予不同的错误级别，并在每个记录器设置下一个记录器，下一个记录器代表链的一部分
public class ChainPatternDemo {

    private static AbstractLogger getChainLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consaleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consaleLogger);

        return errorLogger;
    }

    public static void main(String[] args){

        AbstractLogger loggerChain = getChainLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,"This is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug information");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information");
    }
}
