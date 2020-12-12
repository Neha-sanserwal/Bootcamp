package com.step;

public class Chance {
    private final int totalOutComes;
    
    public Chance(int totalOutComes) {
        this.totalOutComes = totalOutComes;
    }
    
    public double ofFavourableOutCome(int outcome) {
        return (double) outcome / totalOutComes;
    }
}
