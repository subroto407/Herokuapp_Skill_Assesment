package com.internet.Herokuapp.Pages;


import com.internet.Herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends BasePage {
    public FramePage(WebDriver driver){
        super(driver);
    }

    //Nested Frames
    @FindBy(linkText = "Nested Frames")
    public WebElement nestedFramesText;
    public WebElement getNestedFramesText(){
        return nestedFramesText;
    }

    //iFrame CssSelector
    @FindBy(css = "#content > div > ul > li:nth-child(2) > a")
    public WebElement IFrames;
    public WebElement getIFrames(){
        return IFrames;
    }

    //iFrame
    @FindBy(linkText = "iFrame")
    public WebElement iFrame;
    public WebElement getiFrame(){
        return iFrame;
    }
}
