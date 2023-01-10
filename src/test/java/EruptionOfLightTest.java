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

}
