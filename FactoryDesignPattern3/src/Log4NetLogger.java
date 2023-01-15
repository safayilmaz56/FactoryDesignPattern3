public class Log4NetLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("Log4NetLogger ile loglama islemi gerceklestirildi");
    }
}
