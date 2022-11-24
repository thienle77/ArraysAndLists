import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        //Given
        ArrayList<Double> doubleArr = new ArrayList<>();
        doubleArr.add(0, 1.0);
        doubleArr.add(0, 2.0);
        int expected = 2;
        //When
        int actual = AverageDoubleLists.count(doubleArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void sum() {
        //Given
        ArrayList<Double> doubleArr = new ArrayList<>();
        doubleArr.add(0,1.0);
        doubleArr.add(0,2.0);
        double expected = 3.0;
        //When
        double actual = AverageDoubleLists.sum(doubleArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        //Given
        ArrayList<Double> doubleArr = new ArrayList<>();
        doubleArr.add(0,1.0);
        doubleArr.add(0,2.0);
        double expected = 1.5;
        //When
        double actual = AverageDoubleLists.average(doubleArr);
        //Then
        assertEquals(expected, actual);
    }
}