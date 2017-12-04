package thisseasx.december2017.exercises.InstrumentExercise;

class Drum implements MusicalInstrument {

    @Override
    public void playNote() {
        System.out.println("Ntapa ntoupa");
    }

    @Override
    public void outputSound() {
        playNote();
    }
}
