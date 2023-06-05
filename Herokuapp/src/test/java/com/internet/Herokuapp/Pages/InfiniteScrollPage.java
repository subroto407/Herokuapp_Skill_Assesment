package com.internet.Herokuapp.Pages;


import com.internet.Herokuapp.Configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InfiniteScrollPage extends BasePage {
    public InfiniteScrollPage(WebDriver driver){
        super(driver);
    }
    //Header
    @FindBy(css = "#content > div > h3")
    public WebElement header;
    public WebElement getHeader(){
    return header;
    }
}
