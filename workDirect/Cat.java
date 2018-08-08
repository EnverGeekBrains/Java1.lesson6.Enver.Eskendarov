package ru.geekbrains.java1.dz_Enver_Eskendarov.dz6;

public class Cat extends Animal {

    public Cat(double limitRun, double limitJump, double limitSwim) {
        super(limitRun, limitJump, limitSwim);
    }

    @Override
    public void swim(double a) {
        System.out.println("Ooooops, cats can't swim");
    }
}