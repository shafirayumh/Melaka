package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class AccountActivationPage {

    private WebDriver driver;
    private final By txtAccountActivation = By.xpath("//*[@data-testid='account-activation__title']");

    public AccountActivationPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyTitle(){
        String title = driver.findElement(txtAccountActivation).getText();
        Assert.assertEquals(title, "Aktivasi Akun");
    }
}
