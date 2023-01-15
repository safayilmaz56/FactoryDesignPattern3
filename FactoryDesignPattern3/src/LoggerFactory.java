public class LoggerFactory implements ILoggerFactory{

    public ILogger CreateLogger(){
        return new DBLogger();
    }
}
