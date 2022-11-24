import java.util.Arrays;

public class AverageDoubleArrays {


// Complete these methods

    public static int count(double[] aa) {
        return aa.length;
    }

    public static double sum(double[] aa) {
        double sum = 0;
        for (int i = 0; i < aa.length; i++){
            sum = sum + aa[i];
        }
        return sum;

    }

    public static double average(double[] aa) {
        return sum(aa) / aa.length;
    }

}
