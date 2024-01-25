package CodingAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoutingTest {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaroutingtest.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el=driver.findElement(By.xpath("//ul[@class='nav-items-list']/li/a[contains(text(),'About')]"));
        el.click();
        String ExpectedUrl="https://qaroutingtest.ccbp.tech/about";
        String CurrentUrl=driver.getCurrentUrl();
        if(CurrentUrl.equals(ExpectedUrl)){
            System.out.println("Navigated page about");
        }
        WebElement webElement = driver.findElement(By.xpath("//ul[@class='nav-items-list']/li/a[contains(text(),'Contact')]"));
        webElement.click();
        String SecondUrl="https://qaroutingtest.ccbp.tech/contact";
        String currenturl=driver.getCurrentUrl();
        if(currenturl.equals(SecondUrl)){
            System.out.println("Navigated to contact page");
        }
        driver.quit();
}
}