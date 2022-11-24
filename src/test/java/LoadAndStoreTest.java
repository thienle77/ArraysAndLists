import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> actual = new ArrayList<>();
        assertEquals(expected, actual );
    }

    @Test
    void loaddoubleArrayFromFile() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        ArrayList<Double> expected = new ArrayList<>();
        ArrayList<Double> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFile() {
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        assertEquals(expected, actual);
    }
}