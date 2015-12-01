package deors.demos.misc.java8.datelist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NextPaymentJava8Test {

    @Test
    public void testNextPayment() {

        NextPaymentJava8.main(null);

        assertEquals("No more payments expected", NextPaymentJava8.result);
    }
}
