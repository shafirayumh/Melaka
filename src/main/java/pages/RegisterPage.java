package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegisterPage {
    private WebDriver driver;

    private final By registerTitle = By.xpath("//*[@data-testid='register__text__title']");
    private final By textFieldName = By.xpath("//*[@data-testid='register__text-field__name']");
    private final By textFieldPhoneNumber = By.xpath("//*[@data-testid='register__text-field__phone-number']");
    private final By textFieldBusinessName = By.xpath("//*[@data-testid='register__text-field__business-name']");
    private final By textEmail = By.xpath("//*[@data-testid='register__text-field__email']");
    private final By textPassword = By.xpath("//*[@data-testid='register__text-field__password']");
    private final By textConfirmPassword = By.xpath("//*[@data-testid='register__text-field__confirm-password']");
    private final By checkBoxTNC = By.xpath("//*[@data-testid='register__checkbox__tnc']");
    private final By radioBtnDistributor = By.xpath("//*[@data-testid='register__radio-button__distributor']");
    private final By btnRegister = By.xpath("//*[@data-testid='register__button__sign-up']");
    private final By radioBtnRetail = By.xpath("//*[@data-testid='register__radio-button__toko-retail']");
    private final By radioBtnBrand = By.xpath("//*[@data-testid='register__radio-button__brand']");
    private final By radioBtnOnlineSeller = By.xpath("//*[@data-testid='register__radio-button__penjual-online']");
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyTitle(){
        String title = driver.findElement(registerTitle).getText();
        Assert.assertEquals(title, "Selamat Datang di Melaka");
    }

    public void inputName(String name) {
        driver.findElement(textFieldName).sendKeys(name);
    }

    public void inputPhoneNumber(String phoneNumber) {
        driver.findElement(textFieldPhoneNumber).sendKeys(phoneNumber);
    }

    public void inputBusinessName(String businessName) {
        driver.findElement(textFieldBusinessName).sendKeys(businessName);
    }

    public void inputEmail(String email){
        driver.findElement(textEmail).sendKeys(email);
    }

    public void inputPassword(String password){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        driver.findElement(textPassword).sendKeys(password);
    }

    public void inputConfirmPassword(String password){
        driver.findElement(textConfirmPassword).sendKeys(password);
    }

    public void checkTNC(){
        driver.findElement(checkBoxTNC).click();
    }

    public void selectBusinessType(String type){
        if (type.equals("distributor")){
            driver.findElement(radioBtnDistributor).click();
        } else if (type.equals("retail")) {
            driver.findElement(radioBtnRetail).click();
        } else if (type.equals("brand")) {
            driver.findElement(radioBtnBrand).click();
        } else if (type.equals("online")) {
            driver.findElement(radioBtnOnlineSeller).click();
        }
    }

    public void clickRegist(){
        driver.findElement(btnRegister).click();
    }

}
