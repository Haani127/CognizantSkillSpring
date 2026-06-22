package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.FactoryMethodPattern;

public class WordDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}