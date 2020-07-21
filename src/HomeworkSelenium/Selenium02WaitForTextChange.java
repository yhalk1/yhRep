package HomeworkSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Selenium02WaitForTextChange {
    public static  void main (String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[23]/a/img")).click();

        WebElement btn = driver.findElement(By.xpath("//*[@id=\"btn\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(btn).perform();
        System.out.println("Old button title : " + btn.getText());
        Thread.sleep(6000);
        System.out.println("New button title : " + btn.getText());

        driver.close();
        driver.quit();

    }

}