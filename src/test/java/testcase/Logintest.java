package testcase;

import base.Driver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Landingpage;
import pages.Loginpage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 29/10/2016.
 */
    public class Logintest extends Driver {
        static final ExtentReports reports = ExtentReports.get (Driver.class) ;

    @Test
    public void Dologin () {

        reports.startTest("Home page");

        Homepage hp = new Homepage(driver);
        hp.toclickloginbtn();

        reports.log (LogStatus.INFO, "Verify Login") ;
        Loginpage lp = new Loginpage(driver);
        lp.enter_email();
        lp.enter_pw();
        lp.clickbutton();


        Landingpage Lndpg = new Landingpage(driver);

        reports.log (LogStatus.INFO, "Verify Home Button") ;

        try {Lndpg.gotohome();
        } catch (Throwable t)
        {System.out.println("error occured");  }

        reports.log (LogStatus.INFO, "Verify Name Displayed") ;
        {Lndpg.gotoname(); }

            }
        }

