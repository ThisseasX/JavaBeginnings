package thisseasx.december2017.exercises.ObserverExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

class NationalNewsAgency extends Observable {

    private List<String> posts = new ArrayList<>();

    void addPost(String post) {
        posts.add(post);
        setChanged();
        notifyObservers(post);
    }
}
