package selenium.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium2 {
    public static void main(String[] args) {
        //Start session
        WebDriver driver = new ChromeDriver();

        // navigating to webpage
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        //request browser info
        driver.getTitle();

        //establish waiting strat
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //find an element
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        //take action on element
        textBox.sendKeys("Selenium");
        submitButton.click();

        //request element info
        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        //end session
        driver.quit();

    }
}
