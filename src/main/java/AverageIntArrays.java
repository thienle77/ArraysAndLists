import java.util.Arrays;

public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return (int) Arrays.stream(aa).count();
    }

    public int sum(int[] aa) {
        return Arrays.stream(aa).sum();
    }

    public int average(int[] aa) {
        return (int) Arrays.stream(aa).average().orElse(Double.NaN);
    }

}
