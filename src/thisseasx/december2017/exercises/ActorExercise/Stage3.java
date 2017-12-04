package thisseasx.december2017.exercises.ActorExercise;

import java.util.Random;

public class Stage3 {

    public static void main(String[] args) {
        Random r = new Random();

        Actor actor;

        for (int i = 0; i < 10; i++) {
            int x = r.nextInt(100);
            actor = x > 50 ? new HappyActor() : new SadActor();
            actor.act();
        }
    }
}
