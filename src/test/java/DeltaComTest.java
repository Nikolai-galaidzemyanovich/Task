import core.TestBase;
import helpers.RandomHelper;
import org.testng.annotations.Test;
import pages.CreditCardInfoPage;
import pages.HomePageDeltaCom;
import pages.PassengerInfoPage;
import pages.TicketsSelectionPage;

public class DeltaComTest extends TestBase {

    private static final String firstName = RandomHelper.getRandomMessage(5);
    private static final String lastName = RandomHelper.getRandomMessage(5);
    private static final String phone = RandomHelper.getPhoneNumber();
    private static final String email = RandomHelper.getRandomEmail();
    private static final String numberCreditCard = "5556655665555555";
    private static final String cvv = RandomHelper.getRandomNumber(3);
    private static final String nameOnCard = "Ivanov Ivan";
    private static final String address = RandomHelper.getRandomMessage(8);
    private static final String city = RandomHelper.getRandomMessage(7);
    private static final String post = RandomHelper.getRandomNumber(5);

    @Test
    public static void bookATrip() throws InterruptedException {

        HomePageDeltaCom homePageDeltaCom = new HomePageDeltaCom();
        TicketsSelectionPage ticketsSelectionPage = new TicketsSelectionPage();
        PassengerInfoPage passengerInfoPage = new PassengerInfoPage();
        CreditCardInfoPage creditCardInfoPage = new CreditCardInfoPage();

        homePageDeltaCom.bookATrip(driver);
        ticketsSelectionPage.selectTicket(driver);
        passengerInfoPage.enterPassengerInformation(driver,firstName,lastName,phone,email);
        creditCardInfoPage.enterCreditCardInfo(driver,numberCreditCard,cvv,nameOnCard,address,city,post);

    }
}
