package Tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import vse.Interfasces.IAll;
import vse.Utils.TestConf;
import vse.Utils.WebDrivers.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll{

    protected static TestConf testConfig = ConfigFactory.create(TestConf.class);

    @BeforeAll
    static void beforeConfig() {
        Configuration.browser = WebDriver.class.getName();
        Configuration.timeout = 10000;
    }
    @BeforeEach
    public void before() {
        open(testConfig.baseURL());
        WebDriverRunner.getWebDriver().manage().window().setSize(new Dimension(1920,1080));
    }
    @AfterAll
    public static void after(){
        WebDriverRunner.driver().clearCookies();
        WebDriverRunner.driver().close();
    }
}