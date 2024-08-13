package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CookieClickerTest {
    private WebDriver driver;

    public void setUp() {
        driver = new ChromeDriver();
    }

    public void firstTest() {
        try {
            System.out.println("Clicking a cookie...");
            driver.get("https://cookieclicker.ee/");
            WebElement cookie = driver.findElement(By.id("bigCookie"));
            cookie.click();
            System.out.println("Clicked on cookie!");
        } catch (Exception e) {

        }
    }

    public void closeBrowser() {
        driver.close();
        System.out.println("The driver has been closed.");
    }
}
