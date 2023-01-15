public class DBLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("DB ile loglama islemi gerceklestirildi");
    }
}
