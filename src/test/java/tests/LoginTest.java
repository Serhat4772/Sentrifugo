package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Base;
import utils.CommonUtils;

public class LoginTest extends Base {

    /*
      While implementing the selenium code
      1-Create page class(DO  NOT FORGET CREATE CONSTRUCTOR, we have PageFactory.initElement())
      2-we are using testBase class to initialize our webDriver
      3-Inside the test class create an object in @BeforeClass for pages and extend the class with TestBase class.
       */
    private final String CREDENTIAL_PROPERTIES="src/test/resources/credentials.properties";


            @Test
             public void loginPositiveTest(){
            LoginPage loginPage=new LoginPage(driver);

            String url=CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"url");
            driver.get(url);

           String username= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"username");
           loginPage.userName.sendKeys(username);

           String password= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"password");
           loginPage.passWord.sendKeys(password);

           loginPage.loginButton.click();

        }
    @Test
    public void loginNegativeTest1(){
        LoginPage loginPage=new LoginPage(driver);

        String url=CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"url");
        driver.get(url);

        String username= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"username1");
        loginPage.userName.sendKeys(username);

        String password= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"password1");
        loginPage.passWord.sendKeys(password);

        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.errorMessage.getText(),"The username or password you entered is incorrect.");

    }
    @Test
    public void loginNegativeTest2(){
        LoginPage loginPage=new LoginPage(driver);

        String url=CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"url");
        driver.get(url);

        String username= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"username2");
        loginPage.userName.sendKeys(username);

        String password= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"password2");
        loginPage.passWord.sendKeys(password);

        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.errorMessage.getText(),"The username or password you entered is incorrect.");

    }

    @Test
    public void loginNegativeTest3(){
        LoginPage loginPage=new LoginPage(driver);

        String url=CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"url");
        driver.get(url);

        String username= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"username2");
        loginPage.userName.sendKeys(username);

        String password= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"password2");
        loginPage.passWord.sendKeys(password);

        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.errorMessage.getText(),"The username or password you entered is incorrect.");

    }

    @Test
    public void loginNegativeTest4(){
        LoginPage loginPage=new LoginPage(driver);

        String url=CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"url");
        driver.get(url);

        String username= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"username3");
        loginPage.userName.sendKeys(username);

        String password= CommonUtils.readProperty(CREDENTIAL_PROPERTIES,"password3");
        loginPage.passWord.sendKeys(password);

        loginPage.loginButton.click();

        Assert.assertEquals(loginPage.errorMessage.getText(),"The username or password you entered is incorrect.");

    }





}


