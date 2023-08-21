package org.example.models.bonuscard;

public class RangeBonusCard extends BonusCard {
    private int minSmall;
    private int maxSmall;
    private int minBig;
    private int maxBig;

    public int getMinSmall() {
        return minSmall;
    }

    public void setMinSmall(int minSmall) {
        this.minSmall = minSmall;
    }

    public int getMaxSmall() {
        return maxSmall;
    }

    public void setMaxSmall(int maxSmall) {
        this.maxSmall = maxSmall;
    }

    public int getMinBig() {
        return minBig;
    }

    public void setMinBig(int minBig) {
        this.minBig = minBig;
    }

    public int getMaxBig() {
        return maxBig;
    }

    public void setMaxBig(int maxBig) {
        this.maxBig = maxBig;
    }
}
