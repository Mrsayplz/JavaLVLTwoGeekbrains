package ru.geekbrains.homeworkone;

public class Robot implements Participants {

    private final int speed = 20;
    private final double heightJump = 5.0;
    private final String name = "Verter";


    @Override
    public void run() {
        System.out.println("Робот " + name + " бежит со скоростью " + speed);
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгает на " + heightJump + " метра");
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
