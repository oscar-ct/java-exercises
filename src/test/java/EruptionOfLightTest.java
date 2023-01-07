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
}
