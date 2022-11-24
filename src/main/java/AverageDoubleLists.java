import java.util.ArrayList;
import java.util.Arrays;

public class AverageDoubleLists {

    // write out these too
    public static int count(ArrayList<Double> aa) {
        return aa.size();
    }
    public static Double sum(ArrayList<Double> aa) {
        double sum = 0;
        for (int i = 0; i < aa.size(); i++) {
            sum = sum + aa.get(i);

        }
        return sum;
    }
    public static Double average(ArrayList<Double> aa) {
        return (sum (aa) / aa.size());
    }

}
