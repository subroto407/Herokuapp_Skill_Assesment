package com.internet.Herokuapp.TestCases;



import com.internet.Herokuapp.Configuaration.BaseClass;
import com.internet.Herokuapp.LandingPageConfiguaration.LandingPage;
import com.internet.Herokuapp.Pages.JavaScriptAlertsPage;
import com.internet.Herokuapp.Utilites.TestData;
import org.testng.annotations.Test;

public class JavaScriptAlert extends BaseClass {
    @Test

    public void javaScriptAlert(){

        LandingPage lp = new LandingPage(driver);
        JavaScriptAlertsPage jsap =new JavaScriptAlertsPage(driver);

        lp.getJavaScriptAlert().click();
        sleepTime(2000);

        //Alert Text Validation
        jsap.getClickForJSAlert().click();
        sleepTime(2000);

        //get Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);

        //Accept Alert
        driver.switchTo().alert().accept();
        sleepTime(2000);
        // System.out.println("Click For JS Alert Button Alert Accepted");
        System.out.println("JSAlert Result Text : "+ jsap.getResultText().getText());


        //JS Alert text Validation
        jsap.getClickForJSConfirm().click();
        sleepTime(2000);
        //get Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);
        //Accept Alert
        driver.switchTo().alert().accept();
        sleepTime(2000);
        //System.out.println("Click For JS Confirm Button Alert Accepted");
        System.out.println("JS Confirm Result Text :" + jsap.getResultText().getText());


        //Click For JS Prompt And the alert text validation
        jsap.getClickForJSPrompt().click();
        sleepTime(2000);
        //get Alert
        System.out.println(driver.switchTo().alert().getText());
        sleepTime(2000);
        //Accept Alert
        driver.switchTo().alert().sendKeys(TestData.JAVA_SCRIPT_ALERT_JS_PROMPT_INPUT_TEXT);
        sleepTime(2000);
        driver.switchTo().alert().accept();
        sleepTime(2000);
        System.out.println("JS Prompt Result Text :"+ jsap.getResultText().getText());
        sleepTime(2000);

        driver.navigate().to(TestData.BASE_URL);
        sleepTime(2000);


    }
}
