package com.yolo3;

public abstract class Canine extends Pet implements Swimmable{
    //狗科动物的数量
    private static int numOfCanine=0;

    //构造器
    public Canine(String name, int age, double weight) {
        super(name, age, weight);
        numOfCanine++;
    }
    public Canine() {
        numOfCanine++;
    }

    //得到犬科数量的方法
    public static int getNumOfCanine() {
        return numOfCanine;
    }
}
