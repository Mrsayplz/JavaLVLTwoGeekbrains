package ru.geekbrains;

public class Wall {
    private static int overcomingCondition = 2;

    public static void overcoming (){
        Participants[] participants = {
                new Cat(),
                new Person(),
                new Robot()
        };
        for (Participants p: participants) {
            p.jump();
        }
    }

    public static boolean competition (double height, String name){
        boolean result = height>= overcomingCondition;
        String res = result ?  name + " смог перепрыгнуть стену!" :  name + " не смог перепрыгнуть стену и выбывает из соревнований! \n";
        System.out.println(res);
        return result;
    }

}
