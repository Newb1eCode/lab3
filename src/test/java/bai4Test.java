import  org.junit.Test;

import static org.junit.Assert.*;

public class bai4Test {

    @Test
    public void testGetElementAtIndex() throws Exception{
        bai4 i = new bai4();
        try {
            String result = i.getElementAtIndex(129);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "out of bounds");
        }
    }

}