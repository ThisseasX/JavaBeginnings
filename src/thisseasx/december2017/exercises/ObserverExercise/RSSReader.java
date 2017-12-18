package thisseasx.december2017.exercises.ObserverExercise;

import java.util.Observable;
import java.util.Observer;

class RSSReader implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s is reading the new article: %n'%s'%nWow, great news!%n%n",
                this.getClass().getSimpleName(), arg);
    }
}
