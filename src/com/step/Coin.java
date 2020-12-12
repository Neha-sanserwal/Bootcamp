package com.step;

import java.util.Arrays;

public class Coin {
    private final Face[] faces;
    
    public Coin(Face front, Face back) {
        this.faces = new Face[]{ front, back };
    }
    
    public double calculateChanceOfOtherThan(Face face) {
        return 1 - calculateChanceOf(face);
    }
    
    public double calculateChanceOf(Face face) {
        final long count = Arrays.stream(faces).filter(possibleFace -> possibleFace == face).count();
        return (double) count / this.faces.length;
    }
    
}
