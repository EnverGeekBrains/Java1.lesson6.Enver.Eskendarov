package ru.geekbrains.java1.dz_Enver_Eskendarov.dz6;

public class Dz_6 {
    public static void main(String[] args) {

        Dog dog1 = new Dog(500, 0.5, 10);
        Cat cat1 = new Cat(200, 2, 0);
        cat1.run(150);
        cat1.swim(3);
        cat1.jump(1.5);
        dog1.run(600);
        dog1.swim(9);
        dog1.jump(0.3);

    }
}