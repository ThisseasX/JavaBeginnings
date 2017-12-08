package thisseasx.december2017.exercises.WordsExercise;

import java.util.Comparator;
import java.util.Map;

class ValueComparator implements Comparator<String> {

    private final Map<String, Integer> map;

    ValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @SuppressWarnings("ComparatorMethodParameterNotUsed")
    @Override
    public int compare(String o1, String o2) {
        if (map.get(o1) < map.get(o2)) return 1;
        else return -1;
    }
}
