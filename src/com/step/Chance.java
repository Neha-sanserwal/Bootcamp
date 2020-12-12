package com.step;

public class Chance {
    private static final int totalProbability = 1;
    private final double pValue;

    public Chance(double pValue) {
        this.pValue = pValue;
    }

    public Chance not() {
        return new Chance(totalProbability - this.pValue);
    }

    public Chance and(Chance chance) {
        return new Chance(chance.pValue * this.pValue);
    }

    public Chance or(Chance anotherChance) {
        Chance anotherChanceComplement = anotherChance.not();
        return this.not().and(anotherChanceComplement).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.pValue, pValue) == 0;
    }
}
