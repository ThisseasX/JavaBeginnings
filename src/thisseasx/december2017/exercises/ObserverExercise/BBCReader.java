package thisseasx.december2017.exercises.ObserverExercise;

import java.util.Observable;
import java.util.Observer;

class BBCReader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s is reading the new article: %n'%s'%nThat's very interesting!%n%n",
                this.getClass().getSimpleName(), arg);
    }
}
