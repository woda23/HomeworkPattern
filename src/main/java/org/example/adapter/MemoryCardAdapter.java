package org.example.adapter;

public class MemoryCardAdapter implements USB {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readWithUSB() {
        memoryCard.readWithMemoryCard();
    }
}