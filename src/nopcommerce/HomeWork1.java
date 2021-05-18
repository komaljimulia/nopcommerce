package nopcommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork1 {
    WebDriver driver;

    @Test
    public void veryfySetUpAndComputerLink() {
        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//learn by heart
        //Testing Computer link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();
        //driver.close();

//Testing Electronics link

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
      //  driver.close();

        //Testing Apparel link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        //driver.close();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser

        //Testing Digital downloads link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        //driver.close();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser

        //Testing Books link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Books ']")).click();
        //driver.close();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser

        //Testing Jewelry link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
       // driver.close();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser

        //Testing Gift Cards link
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//it will wait to load browser
        driver.get(baseUrl);
        driver.findElement(By.xpath("//div[text()= 'I agree']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("nopCommerce demo store");
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        driver.findElement(By.xpath("//h3[text()='nopCommerce demo store']")).click();
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
     //   driver.close();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it will wait to load browser

    }




}
//Homework -1
//Navigate to google https://www.google.com/
//In Goole search type "nopCommerce demo store" and click search
//Click on the link "nopCommerce demo store"
//Click on Computers and Verify that the user successfully navigated to Computers page.
//Navigate to google https://www.google.com/
//In Goole search type "nopCommerce demo store" and click search
//Click on the link "nopCommerce demo store"
//Click on Electronics and Verify that the user successfully navigated to Electronics page.
//Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.