package Week1_DesignPatterns_DSA_SQL_JUnit_Logging.DesignPatterns.FactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}