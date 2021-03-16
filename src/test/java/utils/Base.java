package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;


    public class Base {

        protected WebDriver driver;
        protected Actions actions;
        protected SoftAssert softAssert;


        @BeforeClass(alwaysRun = true)
        public void setUp(){
            String browser=CommonUtils.readProperty("src/test/resources/credentials.properties","browser");
            driver=DriverUtils.getDriver(browser);
            driver.manage().window().maximize();
        }

        @AfterMethod
        public void tearDown(ITestResult result){
            if (!result.isSuccess()){
                CommonUtils.takeAScreenshot(driver,result.getName());
            }
           // driver.quit();
        }

    }

