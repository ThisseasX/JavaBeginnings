package thisseasx.december2017.exercises.GenericExercise;

class Box<T> {

    private T t1;
    private T t2;
    private T t3;

    Box(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    T get(int index) {
        switch (index) {
            case 0:
                return t1;
            case 1:
                return t2;
            case 2:
                return t3;
            default:
                return null;
        }
    }

    void set(int index, T value) {
        switch (index) {
            case 0:
                this.t1 = value;
                break;
            case 1:
                this.t2 = value;
                break;
            case 2:
                this.t3 = value;
        }
    }

    int size() {
        return 3;
    }
}
