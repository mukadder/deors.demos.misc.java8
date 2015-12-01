package deors.demos.misc.java8.sumproduct;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumProductCalculationJava8Test {

    @Test
    public void testSumProduct() {

        SumProductCalculationJava8.main(null);

        assertEquals(2870, SumProductCalculationJava8.result.intValue());
    }
}
