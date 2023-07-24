package org.example.factory;

public class CoffeeFactoryImpl {
    public static Coffee createCoffee(String type) {
        return switch (type) {
            case "espresso" -> new Espresso();
            case "americano" -> new Americano();
            default -> throw new IllegalArgumentException("Unknown coffee type" + type);
        };
    }
}