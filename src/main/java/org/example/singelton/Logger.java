package org.example.singelton;

import java.time.LocalDate;

public class Logger {
    private static Logger instance = null;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void classLogg(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        System.out.println(String.format("Log info: %s - %s - %s", LocalDate.now(), className, info));
    }
}