package thisseasx.december2017.exercises.StrategyExercise;

public class StrategyExercise {

    public static void main(String[] args) {
        String helloWorld = ("hello_world");

        FileCompressor compressor = new FileCompressor(new ZipCompressionStrategy());
        System.out.println(compressor.compressFile(helloWorld));

        compressor.setStrategy(new RarCompressionStrategy());
        System.out.println(compressor.compressFile(helloWorld));
    }
}
