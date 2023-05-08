package com.codecool.oilcompany.extractor;

import java.util.UUID;

public class Extractor {
    private UUID id;
    private int capacity;
    private int quantity;

    public Extractor(int capacity, int quantity) {
        this.id = UUID.randomUUID();
        this.capacity = capacity;
        this.quantity = quantity;
    }


    public UUID getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getQuantity() {
        return quantity;
    }

    protected int getPercentageExtracted(){
        return quantity*100/capacity;
    }
}

