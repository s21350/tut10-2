package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.name=name;
    }

    @Override
    public String getType() {
        String Type="Cat";
        return Type;
    }

    @Override
    public void start() {
        System.out.println("Cat starts");
    }

    @Override
    public void stop() {
        System.out.println("Cat stops");
    }
}
