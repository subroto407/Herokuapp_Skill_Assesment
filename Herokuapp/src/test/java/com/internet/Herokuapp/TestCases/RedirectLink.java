package com.internet.Herokuapp.TestCases;


import com.internet.Herokuapp.Configuaration.BaseClass;
import com.internet.Herokuapp.LandingPageConfiguaration.LandingPage;
import com.internet.Herokuapp.Pages.RedirectLink.RedirectLinkPage;
import com.internet.Herokuapp.Pages.RedirectLink.StatusCodePage;
import com.internet.Herokuapp.Utilites.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectLink extends BaseClass {
    @Test
    public void redirectLink(){

        LandingPage lp = new LandingPage(driver);
        RedirectLinkPage rlp =new RedirectLinkPage(driver);
        StatusCodePage scp =new StatusCodePage(driver);

        lp.getReDirectLink().click();
        sleepTime(2000);

        //URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, TestData.BASE_URL+ TestData.REDIRECT_LINK);
        System.out.println("Link is valid");
        sleepTime(2000);

        //Header1Text Validation
        if( rlp.getHeader1().isDisplayed()){
            String header1 =rlp.getHeader1().getText() ;
            Assert.assertEquals(header1,TestData.REDIRECTION_PAGE_HEADER_1 );
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(TestData.NEGATIVE_ERROR_MASSAGE);
        }
        rlp.getClickHere().click();
        sleepTime(1000);

        //URL Validation for status code 200
        scp.getRedirectLink200().click();
        sleepTime(2000);
        String statusCode200link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode200link);
        Assert.assertEquals(statusCode200link, TestData.BASE_URL+TestData.STATUS_CODE_200_LINK);
        System.out.println("Status Code 200 Link is valid");
        sleepTime(2000);
        scp.getClickHere().click();
        sleepTime(2000);


        //URL Validation for status code 301
        scp.getRedirectLink301().click();
        sleepTime(1000);
        String statusCode301link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode301link);
        Assert.assertEquals(statusCode301link, TestData.BASE_URL+TestData.STATUS_CODE_301_LINK);
        System.out.println("Status Code 301 Link is valid");
        sleepTime(2000);
        scp.getClickHere().click();
        sleepTime(2000);

        //URL Validation for status code 404
        scp.getRedirectLink404().click();
        sleepTime(1000);
        String statusCode404link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode404link);
        Assert.assertEquals(statusCode404link, TestData.BASE_URL+TestData.STATUS_CODE_404_LINK);
        System.out.println("Status Code 404 Link is valid");
        scp.getClickHere().click();
        sleepTime(2000);


        //URL Validation for status code 500
        scp.getRedirectLink500().click();
        sleepTime(1000);
        String statusCode500link = driver.getCurrentUrl();
        System.out.println("Given "+statusCode500link);
        Assert.assertEquals(statusCode500link, TestData.BASE_URL+TestData.STATUS_CODE_500_LINK);
        System.out.println("Status Code 500 Link is valid");
        sleepTime(2000);
        scp.getClickHere().click();
        sleepTime(2000);


        driver.navigate().to(TestData.BASE_URL);
        sleepTime(1000);


    }
}
