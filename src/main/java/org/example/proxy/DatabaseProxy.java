package org.example.proxy;

public class DatabaseProxy implements Database {
    private Database database;
    private String name;
    private final String PROXY_URL = "localhost:8080";

    public DatabaseProxy(String name) {
        this.database = new DatabaseImpl(name);
        this.name = name;
    }

    @Override
    public void makeConnect() {
        String fullUrl = PROXY_URL + "/" + name;
        System.out.println("Connecting with proxy: " + fullUrl);
        database.makeConnect();
    }
}