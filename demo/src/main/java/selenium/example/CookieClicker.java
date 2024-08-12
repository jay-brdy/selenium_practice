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

        //element IDs
        String cookiesCountId = "cookies";
        String productPricePrefix = "productPrice";
        String productPrefix = "product";

        //find big cookie
        WebElement cookie = driver.findElement(By.id("bigCookie"));

        //click the element once
        // cookie.click();

        //Infinite loop of clicking and upgrading
        while (true) { 
            //click cookie
            cookie.click();

            //get current cookie count
            // splits by spaces, take first part which is the numerical value
            String cookiesCountText = driver.findElement(By.id(cookiesCountId)).getText().split(" ")[0];
            // removes any commas and converts the string into an integer
            int cookiesCount = Integer.parseInt(cookiesCountText.replace(",", ""));
            
            //check products prices
            for (int i = 0; i < 19; i++) {
                //get product price
                String productPriceText = driver.findElement(By.id(productPricePrefix + i)).getText().replace(",","");
               
                //if the product price is not a digit, continue to  next iteration
                if (!productPriceText.matches("\\d+")) {
                    continue;
                }

                int productPrice = Integer.parseInt(productPriceText);

                //if we have enough cookies, buy the product
                if (cookiesCount >= productPrice) {
                    WebElement product = driver.findElement(By.id(productPrefix + i));
                    product.click();
                    break;
                }
            }
        }
    }
}
