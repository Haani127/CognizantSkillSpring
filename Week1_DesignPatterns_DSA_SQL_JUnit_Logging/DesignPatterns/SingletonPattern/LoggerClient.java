package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.SingletonPattern;

public class LoggerClient {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        System.out.println("\nLogger1 HashCode : " + logger1.hashCode());
        System.out.println("Logger2 HashCode : " + logger2.hashCode());

        if (logger1 == logger2) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nDifferent Logger instances exist.");
        }
    }
}