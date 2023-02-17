package Tema8.teste;

import Tema8.pageObjects.RefreshPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshTests extends BaseTest{
    @Test(groups = {"mobile", "desktop"})
    public void refreshPage(){
        driver.get("https://testpages.herokuapp.com/styled/refresh");
        RefreshPage refreshPage = new RefreshPage(driver);
        driver.navigate().refresh();
        Assert.assertEquals(refreshPage.getTimestamp(), refreshPage.getTimestamp(), "Timestamp has been changed!");
    }
}
