import core.TestBase;
import org.testng.annotations.Test;
import pages.TutBy;

public class TutByTest extends TestBase {


    private static final String searchInformation = "automated testing";
    private static final String searchText = "Minsk Automated Testing Community";

    @Test
    public static void searchText (){

        TutBy.searchField(driver, searchInformation);
        TutBy page = new TutBy();
        System.out.println("Counting search result on page: =>" + page.countingSearchResults(driver));
        page.clickSearchResult(driver,searchText);

    }

}
