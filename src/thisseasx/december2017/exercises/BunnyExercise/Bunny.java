package thisseasx.december2017.exercises.BunnyExercise;

class Bunny {

    private int bunnyNumber;

    Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    int getBunnyNumber() {
        return bunnyNumber;
    }

    void hop() {
        System.out.printf("Bunny number #%s is hopping!\n", bunnyNumber);
    }
}
