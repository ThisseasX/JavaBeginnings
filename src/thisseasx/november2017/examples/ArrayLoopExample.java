package thisseasx.november2017.examples;

public class ArrayLoopExample {
    public static void main(String[] args) {
        int[] myarray = {14, 2, -6, 34, 5, 6, 72, 8, 91, 101, 11};

        // first to last
        for (int i = 0; i < myarray.length; i++) {
            System.out.println(myarray[i]);
        }

        // last to first
        for (int i = myarray.length - 1; i >= 0; i--) {
            System.out.println(myarray[i]);
        }

        // Determine and print the smaller and largest values
        int small = myarray[0];
        int large = myarray[0];
        // Why not small, large = ??
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < small) {
                small = myarray[i];
            } else if (myarray[i] > large) {
                large = myarray[i];
            }
        }
        System.out.println(small + " " + large);
    }
}
