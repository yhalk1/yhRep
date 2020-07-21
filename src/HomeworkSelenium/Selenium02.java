package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Selenium02 {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");

       /*String mainWindow = driver.getWindowHandle();
        Thread.sleep(2000);
        //navigate to window section
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
        Thread.sleep(2000);
        //navigate to Open Multiple Windows button
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();*/


        Thread.sleep(6000);
        driver.close();
        driver.quit();
    }

}