import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int sum = 0;
        for(int i = 0; i < aa.size(); i++){
            sum = sum + aa.get(i);

        }
        return sum;
    }

    public int average(ArrayList<Integer> aa) {
        if (aa.size() == 0){
            return 0;
        }
        return sum(aa) / aa.size();
    }
}
