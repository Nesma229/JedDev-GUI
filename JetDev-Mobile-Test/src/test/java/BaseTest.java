import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeMethod;
import pages.RecruitmentPage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

AppiumDriver appiumDriver;
RecruitmentPage recruitmentPage;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.noReset().withBrowserName("Chrome");
        options.autoWebview();
        options.setAutomationName("uiautomator2");
        options.setUdid("emulator-5554");
        options.setDeviceName("Pixel_3a");
       // WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);

        appiumDriver = new AppiumDriver(new URL("http://127.0.0.1:4723"),options);
        appiumDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/addCandidate//login");
        recruitmentPage = new RecruitmentPage(appiumDriver);
    }

//http://127.0.0.1:4723/wd/hub

}
