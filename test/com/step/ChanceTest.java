package com.step;

import org.junit.Assert;
import org.junit.Test;

public class ChanceTest {
    
    @Test
    public void shouldCalculateTheOddsOfGettingTailsWhenFlippingOneCoin() {
        final Chance chance = new Chance(2);
        final double oddsInFavour = chance.ofFavourableOutCome(1);
        Assert.assertEquals(0.5, oddsInFavour,0);
    }
}
