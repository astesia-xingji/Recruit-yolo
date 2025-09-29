package com.yolo3;

public class CatIncubator implements PetIncubator{
    public Pet hatchPet(String name){
        System.out.println("正在孵化魔法猫……");
        return new Cat(name);
    }
    public Pet hatchPet(){
        System.out.println("正在孵化魔法猫……");
        return new Cat();
    }
}
