package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static hook.DriverInitializer.setWebDriver;


public class TestSetup {
    protected WebDriver driver;

    @Before
    public void before() {
        driver = setWebDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
        }
    }
}
