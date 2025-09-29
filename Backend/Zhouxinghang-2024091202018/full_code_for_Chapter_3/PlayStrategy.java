package com.yolo3;

public class PlayStrategy implements InteractionStrategy{
    public void interact(Pet pet1, Pet pet2){
        System.out.println(pet1.getClass().getSimpleName() + pet1.getName()
                + "与" + pet2.getClass().getSimpleName() + pet2.getName() + "愉快地玩耍");
    }
}
