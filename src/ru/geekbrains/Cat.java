package ru.geekbrains;

public class Cat implements Participants {

    private final int speed = 15;
    private final double heightJump = 2.4;
    private final String name = "MayKitty";


    @Override
    public void run() {
        System.out.println("Кот " + name + " бежит со скоростью " + speed);
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " прыгает на " + heightJump + " метра");
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
