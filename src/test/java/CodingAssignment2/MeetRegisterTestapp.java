package CodingAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MeetRegisterTestapp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://qameetup.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//button[@id='registerButton']"));
        element.click();
        String FirstUrl="https://qameetup.ccbp.tech/register";
        String currenturl=driver.getCurrentUrl();
        if(FirstUrl.equals(currenturl)){
            System.out.println("Navigated register page");
        }
        WebElement element1=driver.findElement(By.xpath("//input[@id='name']"));
        element1.sendKeys("ShaikAlthaf");
        WebElement webElement = driver.findElement(By.xpath("//select[@id='topic']"));
        Select sc=new Select(webElement);
        sc.selectByValue("GAMES");
        WebElement e=driver.findElement(By.xpath("//button[@class='RegisterButton-sc-sr3jcr-12 fuqIpV']"));
        e.submit();
        String SecondUrl="https://qameetup.ccbp.tech/";
        String CurrentUrl= driver.getCurrentUrl();
        if(CurrentUrl.equals(SecondUrl)){
            System.out.println("Navigated Home Page");
        }
        driver.get("https://qameetup.ccbp.tech/random-text");
        driver.manage().window().maximize();
        String Url="https://qameetup.ccbp.tech/not-found";
        String ThirdUrl=driver.getCurrentUrl();
        if(ThirdUrl.equals(Url)){
            System.out.println("Navigated To Found Not a page");
        }

    }
}
