package thisseasx.december2017.exercises.ActorExercise;

public class Stage2 {

    public static void main(String[] args) {
        boolean sad = false;

        Actor actor;

        for (int i = 0; i < 10; i++) {
            actor = sad ? new HappyActor() : new SadActor();
            actor.act();
            sad = !sad;
        }
    }
}
