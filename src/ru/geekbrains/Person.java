package ru.geekbrains;

public class Person implements Participants {

    private final int speed = 8;
    private final double heightJump = 0.6;
    private final String name = "Boris";


    @Override
    public void run() {
        System.out.println("Человек " + name + " бежит со скоростью " + speed);
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгает на " + heightJump + " метра");
    }

    public int getSpeed() {
        return speed;
    }

    public double getHeightJump() {
        return heightJump;
    }

    public String getName() {
        return name;
    }
}
