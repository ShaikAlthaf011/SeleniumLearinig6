package CodingAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdduserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaadduser.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement el=driver.findElement(By.xpath("//input[@id='name']"));
        el.sendKeys("ShaikAlthaf");
        WebElement el1=driver.findElement(By.xpath("//input[@id='email']"));
        el1.sendKeys("alltushaik@gmail.com");
        WebElement el2=driver.findElement(By.xpath("//select[@id='status']"));
        Select sc=new Select(el2);
        sc.selectByValue("Active");
        WebElement el5=driver.findElement(By.xpath("//input[@id='genderFemale']"));
        el5.click();
        WebElement el6=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        el6.submit();
        driver.quit();
    }
}
