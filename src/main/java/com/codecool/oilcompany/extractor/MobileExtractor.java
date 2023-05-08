package com.codecool.oilcompany.extractor;

public class MobileExtractor extends ExtractorWithLocation implements FaultReporter {
    public MobileExtractor(int capacity, int quantity, String location) {
        super(capacity, quantity, location);
    }

    public void setLocation(String location){
        this.location = location;
    }


    @Override
    public boolean isFaulty() {
        return this.getPercentageExtracted() < 25;
    }
}
