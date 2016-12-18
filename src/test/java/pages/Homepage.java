package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wale on 29/10/2016.
 */
public class Homepage {

    WebDriver driver ;
    public Homepage (WebDriver driver) {
        this.driver = driver ;
    }

    By Log_in = By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[3] ") ;
    By Sign_up = By.xpath("//*[@id='doc']/div[1]/div/div[1]/div[2]/a[2] ") ;

    public void toclickloginbtn () {
      driver.findElement(Log_in).click();

    }

}
