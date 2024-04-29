import org.example.DataProcessor;
import org.example.DatabaseConnector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DataProcessorTest {

    @Test
    public void testProcessData() {
        // Vytvoření mock objektu
        DatabaseConnector mockConnector = mock(DatabaseConnector.class);

        // Nastavení chování mocku
        when(mockConnector.retrieveData()).thenReturn("Mocked Data");

        // Vytvoření instance třídy pro testování
        DataProcessor processor = new DataProcessor(mockConnector);

        // Volání metody a kontrola výsledku
        String result = processor.processData();
        assertEquals("Processed: Mocked Data", result);
    }
}
