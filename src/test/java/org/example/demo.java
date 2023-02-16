package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class demo {
    @Test
    public void test(){
        System.out.println("welcome");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        //driver.findElement(By.id("login_field")).sendKeys( "vyshnavitanguturi15@gmail.com");
        //driver.findElement(By.name("password")).sendKeys("Poojitha@123");
        driver.findElement(By.className("header-logo"));
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot ")).click();


    }
}
