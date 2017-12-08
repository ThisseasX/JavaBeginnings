package thisseasx.december2017.exercises.ActorExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stage {

    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();

        actors.addAll(Arrays.asList(
                new SadActor(),
                new HappyActor(),
                new SadActor(),
                new HappyActor(),
                new HappyActor(),
                new SadActor(),
                new SadActor(),
                new HappyActor(),
                new SadActor()
        ));

        for (Actor actor : actors) {
            actor.act();
        }
    }
}
