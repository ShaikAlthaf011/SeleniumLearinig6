package CodingAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoappTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
     driver.get(" https://qatodos.ccbp.tech/");
     driver.manage().window().maximize();
        WebElement el1=driver.findElement(By.xpath("//input[@id='todoUserInput']"));
        el1.sendKeys("HTML");
        WebElement el=driver.findElement(By.xpath("//button[@id='addTodoButton']"));
        el.click();
        WebElement el2=driver.findElement(By.xpath("//input[@id='todoUserInput']"));
        el1.sendKeys("CSS");
        WebElement el3=driver.findElement(By.xpath("//button[@id='addTodoButton']"));
        el.click();
        WebElement el4=driver.findElement(By.xpath("//input[@id='todoUserInput']"));
        el1.sendKeys("JavaScript");
        WebElement el5=driver.findElement(By.xpath("//button[@id='addTodoButton']"));
        el.click();
        WebElement el6=driver.findElement(By.xpath("//input[@id='todoUserInput']"));
        el1.sendKeys("Java");
        WebElement el7=driver.findElement(By.xpath("//button[@id='addTodoButton']"));
        el.click();
        WebElement el8=driver.findElement(By.xpath("//input[@id='todoUserInput']"));
        el1.sendKeys("Selenium");
        WebElement el9=driver.findElement(By.xpath("//button[@id='addTodoButton']"));
        el.click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox4']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox5']")).click();
        driver.quit();
    }
}
