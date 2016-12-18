package pages;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/**
 * Created by Wale on 30/10/2016.
 */
public class Landingpage {
    WebDriver driver ;
    public Landingpage (WebDriver driver)

    {
        this.driver = driver ; }

    By Homebutton = By.xpath("//*[@id='global-nav-home']/a/span[2]");
    By Moments = By.xpath("//*[@id='global-actions']/li[2]/a/span[2]");
    By Myname = By.xpath( "//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a") ;

    public void gotohome (){
        if (!driver.findElement(Homebutton).getText().equals("Home")) throw new AssertionError();

    }

    public void gotomoment () {
        if (! driver.findElement (Moments). getText().equals("Moments")) throw new AssertionError();
    }

    public void gotoname () {
        Assert.assertTrue(driver.findElement(Myname).getText().equals ("wale soares") );

    }
}
