package deors.demos.misc.java8.datelist;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NextPaymentJava7Test {

    @Test
    public void testNextPayment() {

        NextPaymentJava7.main(null);

        assertEquals("No more payments expected", NextPaymentJava7.result);
    }
}
