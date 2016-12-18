package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 29/10/2016.
 */
public class Loginpage {

    WebDriver driver ;
    public Loginpage (WebDriver driver) {
        this.driver = driver ;
    }

    By email = By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[1]/input") ;
    By password = By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/div[2]/input") ;
    By logon = By.xpath("//*[@id='login-dialog-dialog']/div[2]/div[2]/div[2]/form/input[1]") ;


    public void enter_email () {
        driver.findElement(email).sendKeys("toniowales2k@yahoo.com");
    }

    public void enter_pw ( ) {
    driver.findElement(password).sendKeys("jesus0101");
    }

    public void clickbutton () {
        driver.findElement(logon).click(); ;
    }


}
