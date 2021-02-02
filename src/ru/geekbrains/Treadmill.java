package ru.geekbrains;

public class Treadmill {
    private static int overcomingCondition = 16;

    public static void overcoming() {
        Participants[] participants = {
                new Cat(),
                new Person(),
                new Robot()
        };
        for (Participants p : participants) {
            p.run();
        }
    }
    public static void competitionTwo (double height, String name){
        boolean result = height>= overcomingCondition;
        String res = result ?  name + " смог выдержать темп беговой дорожки!" :  name + " не смог выдержать темп беговой дорожки!";
        System.out.println(res);
        String medal = result ? name + " получает две медали!" : name + " получает одну медаль!";
        System.out.println(medal + "\n");
    }
}
