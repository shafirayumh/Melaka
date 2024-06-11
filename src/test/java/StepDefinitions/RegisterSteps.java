package StepDefinitions;

import hook.DriverInitializer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountActivationPage;
import pages.RegisterPage;
import utils.GenerateInput;

public class RegisterSteps extends DriverInitializer {
    RegisterPage registerPage = new RegisterPage(driver);
    AccountActivationPage accountActivationPage = new AccountActivationPage(driver);

    String randomName = GenerateInput.generateName();
    String randomPhoneNumber = GenerateInput.generatePhoneNumber();
    String randomBusinessName = GenerateInput.generateBusinessName();
    String randomEmail = GenerateInput.generateEmail();
    String password = GenerateInput.password();

    @Given("User on register page")
    public void userOnRegisterPage(){
        registerPage.verifyTitle();
    }


    @When("User input all field")
    public void userInputAllField() {
        registerPage.inputName(randomName);
        registerPage.inputPhoneNumber(randomPhoneNumber);
        registerPage.inputBusinessName(randomBusinessName);
        registerPage.inputEmail(randomEmail);
        registerPage.inputPassword(password);
        registerPage.inputConfirmPassword(password);
        registerPage.checkTNC();
    }

    @And("choose distributor as Tipe Bisnis")
    public void chooseDistributorAsTipeBisnis() {
        registerPage.selectBusinessType("distibutor");
    }

    @And("clicks register button")
    public void clicksRegisterButton() {
        registerPage.clickRegist();
    }

    @Then("User is navigated to activation account page")
    public void userIsNavigatedActivationAccountPage() {
        accountActivationPage.verifyTitle();
    }

    @And("choose retail as Tipe Bisnis")
    public void chooseRetailAsTipeBisnis() {
        registerPage.selectBusinessType("retail");
    }

    @And("choose brand as Tipe Bisnis")
    public void chooseBrandAsTipeBisnis() {
        registerPage.selectBusinessType("brand");
    }

    @And("choose seller online as Tipe Bisnis")
    public void chooseSellerOnlineAsTipeBisnis() {
        registerPage.selectBusinessType("online");
    }
}
