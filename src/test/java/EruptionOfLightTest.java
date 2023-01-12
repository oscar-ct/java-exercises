import com.sun.source.tree.AssertTree;
import org.junit.Assert;
import org.junit.Test;

public class EruptionOfLightTest {
    EruptionOfLight eruptionOfLight = new EruptionOfLight();
    @Test
    public void findEmailDomainTest() {
        Assert.assertEquals("example.com", eruptionOfLight.findEmailDomain("prettyandsimple@example.com"));
        Assert.assertEquals("usual.com", eruptionOfLight.findEmailDomain("\"very.unusual.@.unusual.com\"@usual.com"));
        Assert.assertEquals("yahoo.com", eruptionOfLight.findEmailDomain("\"much.more unusual\"@yahoo.com"));
    }
    @Test
    public void buildPalindromeTest() {
        Assert.assertEquals("euotmnmtoue", eruptionOfLight.buildPalindrome("euotmn"));
        Assert.assertEquals("cbdbedffcgcffdebdbc", eruptionOfLight.buildPalindrome("cbdbedffcg"));
        Assert.assertEquals("aaaabaaaa", eruptionOfLight.buildPalindrome("aaaaba"));
    }
    @Test
    public void isMAC48AdressTest() {
        Assert.assertTrue(eruptionOfLight.isMAC48Address("00-1B-63-84-45-E6"));
        Assert.assertFalse(eruptionOfLight.isMAC48Address("not a MAC-48 address"));
        Assert.assertFalse(eruptionOfLight.isMAC48Address("G0-00-00-00-00-00"));
    }
    @Test
    public void electionWinnersTest() {
        Assert.assertEquals(2, eruptionOfLight.electionWinners(new int[]{3, 1, 1, 3, 1}, 2));
        Assert.assertEquals(2, eruptionOfLight.electionWinners(new int[]{2, 3, 5, 2}, 3));
        Assert.assertEquals(1, eruptionOfLight.electionWinners(new int[]{5, 1, 3, 4, 1}, 0));
    }

}
