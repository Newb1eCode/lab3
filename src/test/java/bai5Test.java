import org.junit.Test;

import static org.junit.Assert.*;

public class bai5Test {

    @Test(expected = NullPointerException.class)
    public void getUser() {
        bai5 user = new bai5(null);
        String name = user.getUser();
    }
}