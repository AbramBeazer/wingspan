package org.example.models.food;

import java.util.List;

public class BirdFeeder {
    private List<FoodDie> inside;
    private List<FoodDie> outside;

    public List<FoodDie> getInside() {
        return inside;
    }

    public void setInside(List<FoodDie> inside) {
        this.inside = inside;
    }

    public List<FoodDie> getOutside() {
        return outside;
    }

    public void setOutside(List<FoodDie> outside) {
        this.outside = outside;
    }
}
