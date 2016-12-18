package base;

import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Wale on 30/10/2016.
 */
public class Driver {

    public static WebDriver driver =null;

    static final ExtentReports reports = ExtentReports.get(Driver.class) ;


    @BeforeTest
    public void setup() throws IOException {

        reports.init ("C:\\Users\\Anthony Soares\\IdeaProjects\\Twitterapp\\src\\test\\java\\Report\\TwitterApp.html", true) ;
        reports.config (). documentTitle("Report Title") ;
        reports.config (). reportHeadline("Report Headline") ;


        Properties p = new Properties();
        FileInputStream fi = new FileInputStream("C:\\Users\\Anthony Soares\\IdeaProjects\\Twitterapp\\src\\test\\java\\objRepo\\global.properties");
        p.load(fi);

        if (p.getProperty("browser").contains("firefox")) {
            driver = new FirefoxDriver();

        } else if (p.getProperty("browser").contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\Twitterapp\\src\\test\\java\\Browser\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (p.getProperty("browser").contains("ie")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Anthony Soares\\IdeaProjects\\Twitterapp\\src\\test\\java\\Browser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }

        driver.get(p.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();  }

    @AfterMethod
    public void Teardown () {
        driver.close() ;
    }

    }

