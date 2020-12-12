package com.step;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinTest {
    @Test
    public void shouldCalculateTheChanceOfGettingTheGivenFaceWhenFlippingAUnbiasedCoin() {
        final Coin coin = new Coin(Face.HEAD,Face.TAIL);
        final double chance = coin.calculateChanceOf(Face.TAIL);
        assertEquals(0.5, chance,0);
    }
    
    @Test
    public void shouldCalculateTheChanceOfGettingTheGivenFaceWhenFlippingABiasedCoin() {
        final Coin coin = new Coin(Face.TAIL,Face.TAIL);
        final double chance = coin.calculateChanceOf(Face.TAIL);
        assertEquals(1.0, chance,0);
    }
    
    @Test
    public void shouldCalculateTheChanceOfGettingOtherThanTheGivenFaceWhenFlippingABiasedCoin() {
        final Coin coin = new Coin(Face.HEAD,Face.TAIL);
        final double chance = coin.calculateChanceOfOtherThan(Face.TAIL);
        assertEquals(0.5, chance,0);
    }
    
    @Test
    public void shouldCalculateTheChanceOfGettingOtherThanTheGivenFaceWhenFlippingAUnbiasedCoin() {
        final Coin coin = new Coin(Face.TAIL,Face.TAIL);
        final double chance = coin.calculateChanceOfOtherThan(Face.TAIL);
        assertEquals(0.0, chance,0);
    }
}