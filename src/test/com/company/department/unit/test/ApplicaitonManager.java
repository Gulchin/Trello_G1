package test.com.company.department.unit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicaitonManager {
    WebDriver wd;

    public void init() {
        wd= new ChromeDriver();

        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        openSite("https://trello.com/");
    }

    public void openSite(String url) {
          wd.get(url);
      }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    public void stop() {
        wd.quit();
    }

    public void confirmLogin() {
        click(By.cssSelector("#login-submit"));
    }

    public void fillLoginForm(String email, String password) throws InterruptedException {
        type(By.cssSelector("#user"), email);

        Thread.sleep(2000);

        click(By.cssSelector("#login"));

//        click(By.cssSelector("#password"));
//        wd.findElement(By.cssSelector("#password")).clear();
//        wd.findElement(By.cssSelector("#password")).sendKeys("12345.com");

        type(By.cssSelector("#password"), password);
    }

    public void startLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void authorizeGoogle(String email) {
        click(By.cssSelector("#identifierId"));
        wd.findElement(By.cssSelector("#identifierId")).sendKeys(email);
    }

    public void clickLoginWithGoogle() {
        click(By.cssSelector("#googleButton"));
    }
}
