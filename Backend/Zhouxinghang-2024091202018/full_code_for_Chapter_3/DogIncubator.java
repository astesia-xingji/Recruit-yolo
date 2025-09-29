package com.yolo3;

public class DogIncubator implements PetIncubator{
    public Pet hatchPet(String name){
        System.out.println("正在孵化灵魂犬……");
        return new Dog(name);
    }
    public Pet hatchPet(){
        System.out.println("正在孵化灵魂犬……");
        return new Dog();
    }
}
