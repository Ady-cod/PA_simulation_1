package com.codecool.oilcompany.extractor;

import com.codecool.oilcompany.data.Position;
import com.codecool.oilcompany.data.Worker;

import java.util.List;

public class OffshorePlatform extends Extractor implements FaultReporter {
    List<Worker> workers;

    public OffshorePlatform(int capacity, int quantity,List<Worker> workers) {

        super(capacity, quantity);
        this.workers = workers;
    }
    @Override
    public boolean isFaulty() {
        return this.getPercentageExtracted() < 70 || !this.hasMedic() || this.hasExhaustedWorker();
    }

    private boolean hasMedic(){
        for (Worker worker : workers){
            if (worker.getPosition()== Position.MEDIC){
                return true;
            }
        }
        return false;
    }

    private boolean hasExhaustedWorker(){
        for (Worker worker : workers){
            if (worker.getNumberOfDaysOnBoard()>14){
                return true;
            }
        }
        return false;
    }

}
