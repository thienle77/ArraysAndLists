import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return 0;
    }

    public int sum(ArrayList<Integer> aa) {
        ArrayList<Integer>al = new ArrayList<>(aa);
        al.add(0, aa.size());
        return sum(aa);
    }

    public int average(ArrayList<Integer> aa) {
        return 0;
    }
}
