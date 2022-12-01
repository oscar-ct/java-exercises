import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheJourneyBeginsTest {

    TheJourneyBegins theJourneyBegins = new TheJourneyBegins();

    @Test
    public void testAdd() {
        int[] params = {1, 2};
        int[] params2 = {0, 1000};
        Assert.assertEquals(3, theJourneyBegins.add(params[0], params[1]));
        Assert.assertEquals(1000, theJourneyBegins.add(params2[0], params2[1]));
    }
    @Test
    public void testCenturyFromYear() {
        int year = 1905;
        int year2 = 1700;
        assertEquals(20, theJourneyBegins.centuryFromYear(year));
        assertEquals(20, theJourneyBegins.centuryFromYear(year2));
    }
    @Test
    public void testCheckPalindrome() {
        String inputString = "aabaa";
        String inputString2 = "abac";
        assertTrue(theJourneyBegins.checkPalindrome(inputString));
        assertFalse(theJourneyBegins.checkPalindrome(inputString2));
    }

}
