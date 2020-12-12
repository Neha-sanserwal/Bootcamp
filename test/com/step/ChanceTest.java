package com.step;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChanceTest {
    @Test
    public void shouldCalculateTheChanceOfNotGettingTailWhenFlippingACoin(){
        Chance chanceOfGettingTails = new Chance(0.5);

        assertEquals(new Chance(0.5),chanceOfGettingTails.not());
    }

    @Test
    public void shouldCalculateChanceOfGettingAtLeastOneTailsWhenFlippingTwoCoins(){
        Chance chanceOfGettingTails = new Chance(0.5);
        Chance chanceOfGettingNotTails = new Chance(0.5);

        Chance chanceOfGettingAtLeastOneTail = chanceOfGettingTails.or(chanceOfGettingNotTails);

        assertEquals(new Chance(0.75), chanceOfGettingAtLeastOneTail);
    }

    @Test
    public void shouldCalculateChanceOfGettingTailsWhenFlippingTwoCoins(){
        Chance chanceOfGettingTails = new Chance(0.5);

        Chance chanceOfGettingAllTails = chanceOfGettingTails.and(chanceOfGettingTails);

        assertEquals(new Chance(0.25), chanceOfGettingAllTails);
    }
}