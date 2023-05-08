package com.codecool.oilcompany;

import com.codecool.oilcompany.company.OilCompany;
import com.codecool.oilcompany.data.Position;
import com.codecool.oilcompany.data.Worker;
import com.codecool.oilcompany.extractor.Extractor;
import com.codecool.oilcompany.extractor.FixedExtractor;
import com.codecool.oilcompany.extractor.MobileExtractor;
import com.codecool.oilcompany.extractor.OffshorePlatform;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("John", Position.MEDIC,10);
        Worker worker2 = new Worker ("Doe",Position.MANUAL_WORKER,5);
        Worker worker3 = new Worker ("Walker",Position.MANUAL_WORKER,7);
        Worker worker4 = new Worker ("Jane",Position.MANAGER,5);
        Worker worker5 = new Worker ("Roger",Position.MANUAL_WORKER,5);

        Worker worker6 = new Worker("John", Position.MANUAL_WORKER,10);
        Worker worker7 = new Worker ("Doe",Position.MANUAL_WORKER,5);
        Worker worker8 = new Worker ("Walker",Position.MANUAL_WORKER,7);
        Worker worker9 = new Worker ("Jane",Position.MANAGER,5);
        Worker worker10 = new Worker ("Roger",Position.MANUAL_WORKER,5);

        Worker worker11 = new Worker("John", Position.MEDIC,10);
        Worker worker12 = new Worker ("Doe",Position.MANUAL_WORKER,15);
        Worker worker13 = new Worker ("Walker",Position.MANUAL_WORKER,7);
        Worker worker14 = new Worker ("Jane",Position.MANAGER,5);
        Worker worker15 = new Worker ("Roger",Position.MANUAL_WORKER,5);

        Worker worker16 = new Worker("John", Position.MEDIC,10);
        Worker worker17 = new Worker ("Doe",Position.MANUAL_WORKER,5);
        Worker worker18 = new Worker ("Walker",Position.MANUAL_WORKER,7);
        Worker worker19 = new Worker ("Jane",Position.MANAGER,5);
        Worker worker20 = new Worker ("Roger",Position.MANUAL_WORKER,5);

        List<Worker> offshore1Workers = new ArrayList<>(Arrays.asList(worker1,worker2,worker3,worker4,worker5));
        List<Worker>offshore2Workers = new ArrayList<>(Arrays.asList(worker6,worker7,worker8,worker9,worker10));
        List<Worker>offshore3Workers = new ArrayList<>(Arrays.asList(worker11,worker12,worker13,worker14,worker15));
        List<Worker>offshore4Workers = new ArrayList<>(Arrays.asList(worker16,worker17,worker18,worker19,worker20));

        OffshorePlatform offshorePlatform1 = new OffshorePlatform(100,98,offshore1Workers);
        OffshorePlatform offshorePlatform2 = new OffshorePlatform(100,96,offshore2Workers);
        OffshorePlatform offshorePlatform3 = new OffshorePlatform(100,96,offshore3Workers);
        OffshorePlatform offshorePlatform4 = new OffshorePlatform(100,80,offshore4Workers);

        FixedExtractor fixedExtractor1 = new FixedExtractor(100,97,"Siberia");
        FixedExtractor fixedExtractor2 = new FixedExtractor(100,60,"Maroc");

        MobileExtractor mobileExtractor1 = new MobileExtractor(100,98,"NovoSibirsk");
        MobileExtractor mobileExtractor2 = new MobileExtractor(100,20,"Venezuela");
        MobileExtractor mobileExtractor3 = new MobileExtractor(100,50,"Libya");

        List<Extractor>extractors = new ArrayList<>(Arrays.asList(offshorePlatform1,offshorePlatform2,offshorePlatform3,
                offshorePlatform4,fixedExtractor1,fixedExtractor2,mobileExtractor1,mobileExtractor2,
                mobileExtractor3));
        OilCompany oilCompany = new OilCompany(extractors);
        int numberOfDevicesWithFaults = oilCompany.getNumberOfDevicesWithFaults();
        List<Extractor>efficientExtractors = oilCompany.getEfficientExtractors();
        System.out.println();
        System.out.println("The last company report states:");
        System.out.println("The numbers of devices with faults in the company is: " + numberOfDevicesWithFaults);
        System.out.println();
        System.out.println("The most efficient extractors are: ");
        System.out.println();
        for (Extractor extractor : efficientExtractors){
            System.out.println("Extractor id: " + extractor.getId());
            if (extractor instanceof FixedExtractor){
                System.out.println("Extractor type: FixedExtractor");
            }
            if (extractor instanceof MobileExtractor){
                System.out.println("Extractor type: MobileExtractor");
            }
            if (extractor instanceof OffshorePlatform){
                System.out.println("Extractor type: OffshorePlatform");
            }
            System.out.println("-----------------------------------------------");

        }


    }
}