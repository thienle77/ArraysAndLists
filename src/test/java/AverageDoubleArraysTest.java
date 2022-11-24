import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        //Given
        double[] doubleArr = new double[]{2, 4, 5.};
        int expected = 3;
        //When
        int actual = AverageDoubleArrays.count(doubleArr);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void sum() {
        //Given
        double[] doubleArr = new double[]{2, 4, 5};
        double expected = 11.0;
        //When
        double actual = AverageDoubleArrays.sum(doubleArr);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    void average() {
        //Given
        double[] doubleArr = new double[]{2, 4, 5};
        double expected = 3.6666666666666665;
        //When
        double actual = AverageDoubleArrays.average(doubleArr);
        //Then
        assertEquals(expected, actual);
    }
}