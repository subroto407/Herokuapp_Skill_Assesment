package com.internet.Herokuapp.TestCases;



import com.internet.Herokuapp.Configuaration.BaseClass;
import com.internet.Herokuapp.LandingPageConfiguaration.LandingPage;
import com.internet.Herokuapp.Pages.BrokenImagePage;
import com.internet.Herokuapp.Utilites.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BrokenImage extends BaseClass {

    @Test
    public void BrokenImage(){

        LandingPage lp = new LandingPage(driver);
        BrokenImagePage bip = new BrokenImagePage (driver);

        //Click on Broken Image Page
        lp.getBrokenImage().click();
        sleepTime(2000);

        //URL Validation
        String link = driver.getCurrentUrl();
        System.out.println("Given "+link);
        Assert.assertEquals(link, TestData.BASE_URL+TestData.BROKEN_IMAGE_LINK);
        System.out.println("Link is valid");
        sleepTime(1000);


        //Header Validation
        if(bip.getHeader1().isDisplayed()){
            String header =bip.getHeader1().getText() ;
            Assert.assertEquals(header, TestData.BROKEN_IMAGE_HEADER);
            System.out.println("Header Text is valid");

        }
        else{
            System.out.println(TestData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(2000);


        // TC-3 : Broken Image Validation Including (Http response , Broken Image Link)
//        List<WebElement> elementList = driver.findElements(By.tagName("img"));
//        for (int i = 0; i < elementList.size(); i++){
//
//            response = RestAssure.given().contentType("application/json")
//                    .get(elementList.get(i).getAttribute("src"));
//
//            System.out.println("HTTP Response Is: " + response.getStatusCode());
//
//            if ( elementList.get(i).getAttribute("naturalWidth").equals("0")){
//                System.out.println( elementList.get(i).getAttribute("src") + " Is Broken." );
//            }
//
//            else{
//                System.out.println( elementList.get(i).getAttribute("src") + " Is Not Broken." );
//            }
//        }
//
//        driver.navigate().back();
//        sleepTime(2000);


    }
}
