package org.example.models;

public class Habitat {

    private BirdCard[] birds = new BirdCard[5];
    private int numOfBirds = 0;

    public void activateBrownPowers() {
        for (int i = 4; i >= 0; i--) {
            BirdCard currentBird = this.birds[i];
            if (currentBird != null && currentBird.getPower().getPowerColor().equals(PowerColor.BROWN)) {
                currentBird.getPower().activatePower();
            }
        }
    }

    public void addBird(BirdCard bird) {

    }
}
