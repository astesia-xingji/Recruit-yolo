package com.yolo3;

import java.util.Random;

public class PetStoreOpening {
    public static void main(String[] args) {
        Random random = new Random();
        int choice = random.nextInt(3); // 随机选择 0, 1, 或 2

        Pet newCompanion = null; // 使用你的宠物始祖类

        // TODO: 根据随机数choice，为newCompanion实例化一只具体的宠物 (如MagicCat, SpiritDog, BabyDragon)
        switch (choice) {
            case 0:
                PetIncubator catIncubator = IncubatorFactory.getIncubator("Cat");
                newCompanion = catIncubator.hatchPet();
                break;
            case 1:
                PetIncubator dogIncubator = IncubatorFactory.getIncubator("Dog");
                newCompanion = dogIncubator.hatchPet();
                break;
            case 2:
                PetIncubator magicalDragonIncubator = IncubatorFactory.getIncubator("MagicalDragon");
                newCompanion = magicalDragonIncubator.hatchPet();
                break;
        }

        // TODO: 使用instanceof判断newCompanion的真实形态，并向玩家宣布
        // 例如: "恭喜你，获得了一只神奇的魔法猫！"
        if(newCompanion instanceof Cat){
            System.out.println("恭喜你，获得了一只神奇的魔法猫！");
        }else if(newCompanion instanceof Dog){
            System.out.println("恭喜你，获得了一只神奇的灵魂犬！");
        }else if(newCompanion instanceof MagicalDragon){
            System.out.println("恭喜你，获得了一只神奇的魔龙！");
        }else{
            System.out.println("出错了！");
        }

        // TODO: 调用一个被子类重写的方法 (如makeSound())，展现多态的魅力
        newCompanion.makeSound(); // 魔法猫会“喵~”，灵魂犬会“汪！”，幼龙会“嗷~”

    }
}

