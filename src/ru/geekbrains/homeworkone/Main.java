package ru.geekbrains.homeworkone;

public class Main {

    public static void main(String[] args) {
     //   competition();
        calculateHour(DayOfWeek.Friday);


    }

    /**
     * Соревнования
     */
    public static void competition (){
        Cat cat = new Cat();
        Person man = new Person();
        Robot robot = new Robot();

        Wall.overcoming();
        System.out.println("");
        Treadmill.overcoming();
        System.out.println("\nПроведем соревнования на прыжки в высоту и выносливость !!! \n ");

        if ( Wall.competition(cat.getHeightJump(),cat.getName())){
            Treadmill.competitionTwo(cat.getSpeed(), cat.getName());
        } if (Wall.competition(man.getHeightJump(),man.getName())){
            Treadmill.competitionTwo(man.getSpeed(),man.getName());
        }  if (Wall.competition(robot.getHeightJump(),robot.getName())){
            Treadmill.competitionTwo(robot.getSpeed(), robot.getName());
        } else System.out.println("Все слабаки!!!");
    }

    public static void calculateHour(DayOfWeek dayOfWeek){
        System.out.println(WorkHourCalculate.workHourCalculate(dayOfWeek.getnumOfDay()));
    }
}
