import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class bai1Test {
    @Rule
    public ExpectedException exThrow = ExpectedException.none();
    @Test(expected = ArithmeticException.class)
    public void divTestt() throws Exception{
        bai1 mt = new bai1();
        mt.div(4,6);
    }

    @Test
    public void divTryCatch() {
        bai1 mt1 = new bai1();
        try {
            mt1.div(4,6);
            fail("Not");
        } catch (Exception e) {
            assertEquals("Loi", e.getMessage());
            assertThat(e,instanceOf(ArithmeticException.class));
        }
    }
}