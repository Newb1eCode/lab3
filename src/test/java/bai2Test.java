import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class bai2Test {

    @Rule
    public ExpectedException exThrow = ExpectedException.none();

    @Test(expected = ArithmeticException.class)
    public void chia() {
        bai2 ts = new bai2();
        ts.Chia(3,0);
    }
}