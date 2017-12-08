package thisseasx.december2017.exercises.GenericExercise;

class Box<K> {

    private K k1;
    private K k2;
    private K k3;

    Box(K k1, K k2, K k3) {
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }

    K get(int index) {
        if (index <= 0) return k1;
        else if (index >= 2) return k3;
        else return k2;
    }

    K set(int index, K value) {
        if (index <= 0) return k1 = value;
        else if (index >= 2) return k3 = value;
        else return k2 = value;
    }

    int size() {
        return 3;
    }
}
