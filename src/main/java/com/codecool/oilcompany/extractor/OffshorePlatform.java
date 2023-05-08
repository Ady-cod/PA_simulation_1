package com.codecool.oilcompany.extractor;

import com.codecool.oilcompany.FaultReporter;
import com.codecool.oilcompany.data.Worker;

import java.util.List;

public class OffshorePlatform extends Extractor implements FaultReporter {
    List<Worker> workers;

    public OffshorePlatform(int capacity, int quantity,List<Worker> workers) {
        super(capacity, quantity);
    }
    @Override
    public boolean isFaulty() {
        return false;
    }

    private boolean hasMedic(){

    }

    private boolean hasWorkedLess(){

    }

}
