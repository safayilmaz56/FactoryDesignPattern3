public class LoggerFactory2 implements ILoggerFactory{
    @Override
    public ILogger CreateLogger() {
        return new Log4NetLogger();
    }
}
