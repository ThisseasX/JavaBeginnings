package thisseasx.december2017.exercises.StrategyExercise;

class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public String compress(String s) {
        return s + ".rar";
    }
}
