package com.yolo3;

public abstract class Feline extends Pet{
    //猫科动物的数量
    private static int numOfFeline=0;

    //构造器
    public Feline(String name, int age, double weight) {
        super(name, age, weight);
        numOfFeline++;
    }
    public Feline() {
        numOfFeline++;
    }

    //得到猫科数量的方法
    public static int getNumOfFeline() {
        return numOfFeline;
    }
}
