package org.example.adapter;

public class Computer implements USB {
    @Override
    public void readWithUSB() {
        System.out.println("Reading with helping USB");
    }
}