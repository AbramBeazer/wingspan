package org.example.models;

public abstract class Power {
    private PowerColor powerColor;

    public PowerColor getPowerColor() {
        return powerColor;
    }

    public void setPowerColor(PowerColor powerColor) {
        this.powerColor = powerColor;
    }

    public void activatePower(GameState gameState) {

    }
}
