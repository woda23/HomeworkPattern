package org.example.proxy;

public class DatabaseImpl implements Database {
    private String name;

    public DatabaseImpl(String name) {
        this.name = name;
    }
    @Override
    public void makeConnect() {
        System.out.println("Connected to database with name: " + name);
    }
}
