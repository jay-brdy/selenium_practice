package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieClicker {
    public static void main(String[] args) {
        //start session
        WebDriver driver = new ChromeDriver();

        //navigate to webpage
        driver.get("https://cookieclicker.ee/");

        //find big cookie
        WebElement cookie = driver.findElement(By.id("bigCookie"));

        //click the element once
        cookie.click();
    }
}
