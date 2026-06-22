package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.FactoryMethodPattern;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}