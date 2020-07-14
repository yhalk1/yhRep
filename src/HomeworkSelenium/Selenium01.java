package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Selenium01 {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("http://www.leafground.com/");
        String mainWindow = driver.getWindowHandle();
        Thread.sleep(2000);
        //navigate to window section
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img")).click();
        Thread.sleep(2000);
        //navigate to Open Multiple Windows button
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();


        Thread.sleep(6000);
        Set<String> windows = driver.getWindowHandles();
        for (int i=0; i<3; i++){
            driver.switchTo().window(windows.toArray()[0].toString());
            String title = driver.getTitle();
            System.out.println(title);
        }
        driver.switchTo().window(windows.toArray()[2].toString());
        driver.manage().window().maximize();
        WebElement btn = driver.findElement(By.id("color"));
        Actions action = new Actions(driver);
        action.moveToElement(btn).perform();
        System.out.println("The : " + btn.getAttribute("style"));
        System.out.println("Button title : " + btn.getText());

        Thread.sleep(6000);
        driver.close();
        driver.quit();

    }
}