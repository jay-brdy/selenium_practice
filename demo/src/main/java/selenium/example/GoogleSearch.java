package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        //Start session
        WebDriver driver = new ChromeDriver();

        //navigating to webpage
        driver.get("https://www.google.com");

        //find the search input element by class name
        WebElement inputElement = driver.findElement(By.className("gLFyf"));

        //type "blue jay birds" into the serach input + press enter key
        inputElement.sendKeys("blue jay birds" + Keys.RETURN);

        //pause for 3 seconds to load results
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //find the link element by class name and click on it
        WebElement link = driver.findElement(By.cssSelector("a.ruhjFe.NJLBac.fl"));
        link.click();
        
        //pause for 5 seconds to see result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //quit
        driver.quit();
    }
}
