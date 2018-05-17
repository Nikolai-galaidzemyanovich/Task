import core.TestBase;
import helpers.RandomHelper;
import org.testng.annotations.Test;
import pages.Gmail;

public class GmailTest extends TestBase {

    private static final String pasword = "JGGJhfdhfrhbfjhdf757575";
    private static final String email = "postfortest123456789@gmail.com";
    private static final String message = RandomHelper.getRandomMessage(35);
    private static final String subject = RandomHelper.getRandomMessage(10);
    private static final String mail = RandomHelper.getRandomEmail();
    private static final String searchWorld = "a";

    @Test
    public static void loginInGmail() throws InterruptedException {
        Gmail page = new Gmail();
        page.loginInGmailAccount(driver,email,pasword,searchWorld);
        page.writeAndSendLetter(driver,mail,subject,message);
    }
}
