package com.yolo3;

public class IncubatorFactory {
    public static PetIncubator getIncubator(String petType) {
        switch (petType.toLowerCase()) {
            case "dog":
                return new DogIncubator();
            case "cat":
                return new CatIncubator();
            case "magicaldragon":
                return new MagicalDragonIncubator();
            default:
                throw new IllegalArgumentException("不支持孵化" + petType + ".");
        }
    }
}