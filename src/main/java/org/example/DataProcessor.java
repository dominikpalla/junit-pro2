package org.example;

public class DataProcessor {
    private DatabaseConnector dbConnector;

    public DataProcessor(DatabaseConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public String processData() {
        return "Processed: " + dbConnector.retrieveData();
    }
}

