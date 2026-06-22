package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.FactoryMethodPattern;

public class ExcelDocument implements Document {

    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}