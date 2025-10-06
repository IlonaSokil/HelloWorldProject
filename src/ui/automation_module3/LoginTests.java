package ui.automation_module3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTests {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void checkPageTitle() {
        String title = driver.getTitle();
        System.out.println("Заголовок сторінки: " + title);

        Assert.assertTrue(title.contains("Swag Labs"));
    }

    @Test(priority = 2)
    public void checkLoginFields() {
        SoftAssert softAssert = new SoftAssert();
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        softAssert.assertTrue(usernameField.isDisplayed(), "Поле логіну відсутнє");
        softAssert.assertTrue(passwordField.isDisplayed(), "Поле паролю відсутнє");
        softAssert.assertAll();
    }

    @Test(dataProvider = "loginData", priority = 3)
    public void checkLoginData(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"", "secret_sauce"},
                {"standard_user", ""}
        };
    }
}