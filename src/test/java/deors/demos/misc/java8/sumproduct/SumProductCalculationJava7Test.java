package deors.demos.misc.java8.sumproduct;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SumProductCalculationJava7Test {

    @Test
    public void testSumProduct() {

        SumProductCalculationJava7.main(null);

        assertEquals(14350, SumProductCalculationJava7.result.intValue());
    }
}
