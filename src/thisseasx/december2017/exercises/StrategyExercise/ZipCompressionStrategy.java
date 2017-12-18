package thisseasx.december2017.exercises.StrategyExercise;

class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public String compress(String s) {
        return s + ".zip";
    }
}
