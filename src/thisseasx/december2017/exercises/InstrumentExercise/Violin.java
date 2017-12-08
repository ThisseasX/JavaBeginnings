package thisseasx.december2017.exercises.InstrumentExercise;

class Violin implements MusicalInstrument {

    @Override
    public void playNote() {
        System.out.println("Iiiiiiiiii");
    }

    @Override
    public void outputSound() {
        playNote();
    }
}
