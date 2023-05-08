package com.codecool.oilcompany.company;

import com.codecool.oilcompany.extractor.Extractor;
import com.codecool.oilcompany.extractor.FaultReporter;
import com.codecool.oilcompany.extractor.MobileExtractor;
import com.codecool.oilcompany.extractor.OffshorePlatform;

import java.util.ArrayList;
import java.util.List;

public class OilCompany {
    private List<Extractor> extractors;

    public OilCompany(List<Extractor> extractors) {
        this.extractors = extractors;
    }

    public List<Extractor> getExtractors() {
        return extractors;
    }
    public int getNumberOfDevicesWithFaults(){
        int numberOfDevicesWithFaults = 0;
        for (Extractor extractor : extractors){
            if ((extractor instanceof MobileExtractor || extractor instanceof OffshorePlatform)
                    && ((FaultReporter) extractor).isFaulty()){
                numberOfDevicesWithFaults++;
            }
        }
        return numberOfDevicesWithFaults;
    }
    public List<Extractor> getEfficientExtractors() {
        List<Extractor> efficientExtractors = new ArrayList<>();
        for (Extractor extractor : extractors){
            if (extractor.getPercentageExtracted()>95){
                efficientExtractors.add(extractor);
            }
        }
        return efficientExtractors;
    }
}
