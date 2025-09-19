package com.yolo3;

public class MagicalDragonIncubator implements PetIncubator{
    public Pet hatchPet(String name) {
        System.out.println("正在孵化魔龙……");
        return new MagicalDragon(name);
    }
    public Pet hatchPet() {
        System.out.println("正在孵化魔龙……");
        return new MagicalDragon();
    }
}
