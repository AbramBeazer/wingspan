package org.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.example.models.food.Food;
import org.example.models.food.FoodCost;
import org.example.models.food.FoodSupply;

public class BirdCard {

    private int id;
    private String name;
    private String taxonomicalName;
    private String description;
    private int wingspan;
    private Set<Habitat> habitats;
    private List<FoodCost> foodCosts;
    private int pointValue;
    private NestType nestType;
    private int eggCapacity;
    private int eggs;
    private FoodSupply cachedFood;
    private int tuckedCards;
    private Power power;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxonomicalName() {
        return taxonomicalName;
    }

    public void setTaxonomicalName(String taxonomicalName) {
        this.taxonomicalName = taxonomicalName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public Set<Habitat> getHabitats() {
        return habitats;
    }

    public void setHabitats(Set<Habitat> habitats) {
        this.habitats = habitats;
    }

    public List<FoodCost> getFoodCosts() {
        if (foodCosts == null) {
            foodCosts = new ArrayList<>();
        }
        return foodCosts;
    }

    public void setFoodCosts(List<FoodCost> foodCosts) {
        this.foodCosts = foodCosts;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public NestType getNestType() {
        return nestType;
    }

    public void setNestType(NestType nestType) {
        this.nestType = nestType;
    }

    public int getEggCapacity() {
        return eggCapacity;
    }

    public void setEggCapacity(int eggCapacity) {
        this.eggCapacity = eggCapacity;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public FoodSupply getCachedFood() {
        return cachedFood;
    }

    public void setCachedFood(FoodSupply cachedFood) {
        this.cachedFood = cachedFood;
    }

    public int getTuckedCards() {
        return tuckedCards;
    }

    public void setTuckedCards(int tuckedCards) {
        this.tuckedCards = tuckedCards;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }
}
