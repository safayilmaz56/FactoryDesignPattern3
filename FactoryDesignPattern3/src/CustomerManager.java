public class CustomerManager {
    ILoggerFactory loggerFactory;

    public CustomerManager(ILoggerFactory loggerFactory){
        this.loggerFactory = loggerFactory;
    }
    public void Kayit(){
        System.out.println("kayit yapildi");
        ILogger logger = loggerFactory.CreateLogger();
        logger.log();
    }
}
