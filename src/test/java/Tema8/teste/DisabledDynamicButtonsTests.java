package Tema8.teste;

import Tema8.pageObjects.DisabledDynamicButtonsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledDynamicButtonsTests extends BaseTest {

    @Test(groups = {"mobile", "desktop"})
    public void dynamicButtonsTests() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");
        DisabledDynamicButtonsPage disabledDynamicButtonsPage = new DisabledDynamicButtonsPage(driver);
        disabledDynamicButtonsPage.waitForTheStartButtonToBeClickable();
        disabledDynamicButtonsPage.clickOnStartButton();
        disabledDynamicButtonsPage.waitForOneButtonToBeClickable();
        disabledDynamicButtonsPage.clickOnOneButton();
        disabledDynamicButtonsPage.waitForTheMessageToDisappear();
        disabledDynamicButtonsPage.clickOnSecondButton();
        disabledDynamicButtonsPage.waitForTheMessageToDisappear();
        disabledDynamicButtonsPage.clickOnThirdButton();
        Assert.assertEquals(disabledDynamicButtonsPage.confirmationMessage(), "All Buttons Clicked", "Click Buttons In Order");
    }
}
