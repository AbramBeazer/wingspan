package org.example.models.food;

import java.util.Random;

public class FoodDie {

    private static final Random RANDOM = new Random();
    private FoodFace food;

    private enum FoodFace {
        WORM,
        WHEAT,
        BERRY,
        FISH,
        RAT,
        WORM_OR_WHEAT
    }

    public FoodDie() {
        int face = RANDOM.nextInt(6);
        switch (face) {
            case 0:
                this.food = FoodFace.WORM;
                break;
            case 1:
                this.food = FoodFace.WHEAT;
                break;
            case 2:
                this.food = FoodFace.BERRY;
                break;
            case 3:
                this.food = FoodFace.FISH;
                break;
            case 4:
                this.food = FoodFace.RAT;
                break;
            case 5:
                this.food = FoodFace.WORM_OR_WHEAT;
                break;
            default: throw new RuntimeException("Somehow we reached a FoodFace value beyond 0-5");
        }
    }

    public FoodFace getFoodFace() {
        return food;
    }

    public void setFoodFace(FoodFace food) {
        this.food = food;
    }
}
