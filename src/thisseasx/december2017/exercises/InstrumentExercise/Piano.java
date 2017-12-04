package thisseasx.december2017.exercises.InstrumentExercise;

class Piano implements MusicalInstrument {

    @Override
    public void playNote() {
        System.out.println("Pling Plong");
    }

    @Override
    public void outputSound() {
        playNote();
    }
}
