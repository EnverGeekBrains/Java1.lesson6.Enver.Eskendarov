package ru.geekbrains.java1.dz_Enver_Eskendarov.dz6;

public class Animal {

    private double limitRun;
    private double limitJump;
    private double limitSwim;

    public Animal(double limitRun, double limitJump, double limitSwim) {
        this.limitRun = limitRun;
        this.limitJump = limitJump;
        this.limitSwim = limitSwim;
    }

    public void run(double a) {
        System.out.println("the " + this.getClass().getSimpleName() + " will run " + a + " meters: " + (a <= limitRun));
    }

    public void jump(double a) {
        System.out.println("the " + this.getClass().getSimpleName() + " will jump " + a + " meters: " + (a <= limitJump));
    }

    public void swim(double a) {
        System.out.println("the " + this.getClass().getSimpleName() + " will swim " + a + " meters: " + (a <= limitSwim));
    }
}