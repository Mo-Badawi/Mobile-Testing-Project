package MobileTestingBadawi;
import MobileTestingBase.BaseTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DuolingoBadawi extends BaseTest{


    @Test(priority = 1)
    public void LoginClick() throws InterruptedException {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("Log in")));
        WebElement LoginClick = driver.findElement(AppiumBy.accessibilityId("Log in"));
        LoginClick.click();
    }
    
    @Test(priority = 2)
    public void FillPassword() throws InterruptedException {
    	
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.accessibilityId("new UiSelector().className(\\\"android.widget.EditText\\\").instance(0)")));
        WebElement FillPass = driver.findElement(AppiumBy.accessibilityId("Password,"));
        FillPass.click();
        FillPass.sendKeys("123456");
    }

    @Test(priority = 3)
    public void ClickLogIn() throws InterruptedException {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"Log in\"]")));
        WebElement Login = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Log in\"]"));
        Login.click();    
    }}