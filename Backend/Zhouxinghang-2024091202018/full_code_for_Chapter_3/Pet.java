package com.yolo3;

public abstract class Pet {
    //宠物的名字
    private String name;

    //宠物的年岁
    private int age;

    //宠物的重量（kg）
    private double weight;

    //宠物的数量
    static int numOfPet=0;

    //构造器
    public Pet(String name, int age, double weight) {
        numOfPet++;
        this.age = age;
        this.weight = weight;
    }
    public Pet(){
        numOfPet++;
    }

    //getter and setter

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //宠物进食的抽象方法，交给子类去实现
    public abstract void feed();

    //宠物发声的抽象方法，交给子类去实现
    public abstract void makeSound();

    //得到宠物数量的方法
    public static int getNumOfPet() {
        return numOfPet;
    }
}
