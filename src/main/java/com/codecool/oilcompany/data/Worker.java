package com.codecool.oilcompany.data;

public class Worker {
    private String name;
    private Position position;
    private int numberOfDaysOnBoard;

    public Worker(String name, Position position, int numberOfDaysOnBoard) {
        this.name = name;
        this.position = position;
        this.numberOfDaysOnBoard = numberOfDaysOnBoard;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumberOfDaysOnBoard() {
        return numberOfDaysOnBoard;
    }
}
