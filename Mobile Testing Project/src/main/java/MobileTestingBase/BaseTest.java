package MobileTestingBase;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
    public AndroidDriver driver;
    public WebDriverWait wait;

    @SuppressWarnings("deprecation")
	@BeforeClass
    public void setUp() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setUdid("emulator-5554")
                .setDeviceName("sdk_gphone64_x86_64")
                .setAppPackage("com.duolingo");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait  = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    
    
    
    
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }
	
}