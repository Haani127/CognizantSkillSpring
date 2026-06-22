package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.SingletonPattern;

public class Logger {

    private static Logger instance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}