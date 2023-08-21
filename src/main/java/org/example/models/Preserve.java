package org.example.models;

import java.util.ArrayList;
import java.util.List;

import org.example.models.food.FoodSupply;

public class Preserve {

    private Habitat forest;
    private Habitat grassland;
    private Habitat wetland;
    private List<BirdCard> hand;
    private FoodSupply foodSupply;

    public Habitat getForest() {
        return forest;
    }

    public void setForest(Habitat forest) {
        this.forest = forest;
    }

    public Habitat getGrassland() {
        return grassland;
    }

    public void setGrassland(Habitat grassland) {
        this.grassland = grassland;
    }

    public Habitat getWetland() {
        return wetland;
    }

    public void setWetland(Habitat wetland) {
        this.wetland = wetland;
    }

    public List<BirdCard> getHand() {
        if (hand == null) {
            hand = new ArrayList<>();
        }
        return hand;
    }

    public void setHand(List<BirdCard> hand) {
        this.hand = hand;
    }

    public FoodSupply getFoodSupply() {
        return foodSupply;
    }

    public void setFoodSupply(FoodSupply foodSupply) {
        this.foodSupply = foodSupply;
    }
}
