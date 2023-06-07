import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Hello!");
        assertTrue(myString.detectCapitalUse());
        myString.setString("this has no capitals!");
        assertFalse(myString.detectCapitalUse());
        myString.setString("This does!");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("yo!");
        assertFalse(myString.detectCapitalUse());
        myString.setString("THIS HAS CAPITALS!");
        assertTrue(myString.detectCapitalUse());
        myString.setString("this doesn't...");
        assertFalse(myString.detectCapitalUse());
    }


}
