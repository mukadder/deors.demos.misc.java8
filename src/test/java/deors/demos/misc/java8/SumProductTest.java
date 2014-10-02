package deors.demos.misc.java8;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;
import org.junit.Test;

public class SumProductTest {

    @Test
    public void testSumProduct4Elem() {
        List<Pair<Integer, Integer>> thePairList = new ArrayList<>();
        thePairList.add(new Pair<Integer, Integer>(10, 1));
        thePairList.add(new Pair<Integer, Integer>(12, 2));
        thePairList.add(new Pair<Integer, Integer>(14, 3));
        thePairList.add(new Pair<Integer, Integer>(16, 4));

        Integer result = thePairList.parallelStream().
            mapToInt(p -> p.getValue0() * p.getValue1()).sum();

        assertEquals(Integer.valueOf(140), result);
    }

    @Test
    public void testSumProduct14Elem() {
        List<Pair<Integer, Integer>> thePairList = new ArrayList<>();
        thePairList.add(new Pair<Integer, Integer>(10, 1));
        thePairList.add(new Pair<Integer, Integer>(12, 2));
        thePairList.add(new Pair<Integer, Integer>(14, 3));
        thePairList.add(new Pair<Integer, Integer>(16, 4));
        thePairList.add(new Pair<Integer, Integer>(18, 5));
        thePairList.add(new Pair<Integer, Integer>(20, 6));
        thePairList.add(new Pair<Integer, Integer>(22, 7));
        thePairList.add(new Pair<Integer, Integer>(24, 8));
        thePairList.add(new Pair<Integer, Integer>(26, 9));
        thePairList.add(new Pair<Integer, Integer>(28, 10));
        thePairList.add(new Pair<Integer, Integer>(30, 11));
        thePairList.add(new Pair<Integer, Integer>(32, 12));
        thePairList.add(new Pair<Integer, Integer>(34, 13));
        thePairList.add(new Pair<Integer, Integer>(36, 14));

        Integer result = thePairList.parallelStream().
            mapToInt(p -> p.getValue0() * p.getValue1()).sum();

        assertEquals(Integer.valueOf(2870), result);
    }

    @Test
    public void testSumProduct70Elem() {
        List<Pair<Integer, Integer>> thePairList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            thePairList.add(new Pair<Integer, Integer>(10, 1));
            thePairList.add(new Pair<Integer, Integer>(12, 2));
            thePairList.add(new Pair<Integer, Integer>(14, 3));
            thePairList.add(new Pair<Integer, Integer>(16, 4));
            thePairList.add(new Pair<Integer, Integer>(18, 5));
            thePairList.add(new Pair<Integer, Integer>(20, 6));
            thePairList.add(new Pair<Integer, Integer>(22, 7));
            thePairList.add(new Pair<Integer, Integer>(24, 8));
            thePairList.add(new Pair<Integer, Integer>(26, 9));
            thePairList.add(new Pair<Integer, Integer>(28, 10));
            thePairList.add(new Pair<Integer, Integer>(30, 11));
            thePairList.add(new Pair<Integer, Integer>(32, 12));
            thePairList.add(new Pair<Integer, Integer>(34, 13));
            thePairList.add(new Pair<Integer, Integer>(36, 14));
        }

        Integer result = thePairList.parallelStream().
            mapToInt(p -> p.getValue0() * p.getValue1()).sum();

        assertEquals(Integer.valueOf(14350), result);
    }
}
