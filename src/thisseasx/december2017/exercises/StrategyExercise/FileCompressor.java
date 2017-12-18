package thisseasx.december2017.exercises.StrategyExercise;

class FileCompressor {

    private CompressionStrategy strategy;

    FileCompressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    String compressFile(String s) {
        return strategy.compress(s);
    }
}
