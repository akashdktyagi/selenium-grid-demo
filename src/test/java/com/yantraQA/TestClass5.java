package com.yantraQA;

import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@Log4j2
public class TestClass5 {

    @Test
    public void TestClass5_Test1(){
        String url = "http://demo.automationtesting.in/Index.html";
        WebDriver driver  =  new ChromeDriver();
        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Index.html");
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        String titleAfter = driver.getTitle();
        log.info("title of the page: " + titleAfter);

        if (titleAfter.equalsIgnoreCase("Register")){
            log.info("Test Case is Passed");
            Assert.assertTrue("Test Case is Passed!", true);
        }else{
            log.error("Test Case is Failed");
            Assert.assertTrue("Test Case is Failed!", false);
        }
        driver.quit();
    }

    @Test
    public void TestClass5_Test2(){
        String url = "http://demo.automationtesting.in/Index.html";
        WebDriver driver  =  new ChromeDriver();
        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Index.html");
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        String titleAfter = driver.getTitle();
        log.info("title of the page: " + titleAfter);

        if (titleAfter.equalsIgnoreCase("Register")){
            log.info("Test Case is Passed");
            Assert.assertTrue("Test Case is Passed!", true);
        }else{
            log.error("Test Case is Failed");
            Assert.assertTrue("Test Case is Failed!", false);
        }
        driver.quit();
    }

    @Test
    public void TestClass5_Test3(){
        String url = "http://demo.automationtesting.in/Index.html";
        WebDriver driver  =  new ChromeDriver();
        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Index.html");
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        String titleAfter = driver.getTitle();
        log.info("title of the page: " + titleAfter);

        if (titleAfter.equalsIgnoreCase("Register")){
            log.info("Test Case is Passed");
            Assert.assertTrue("Test Case is Passed!", true);
        }else{
            log.error("Test Case is Failed");
            Assert.assertTrue("Test Case is Failed!", false);
        }
        driver.quit();
    }

    @Test
    public void TestClass5_Test4(){
        String url = "http://demo.automationtesting.in/Index.html";
        WebDriver driver  =  new ChromeDriver();
        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Index.html");
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        String titleAfter = driver.getTitle();
        log.info("title of the page: " + titleAfter);

        if (titleAfter.equalsIgnoreCase("Register")){
            log.info("Test Case is Passed");
            Assert.assertTrue("Test Case is Passed!", true);
        }else{
            log.error("Test Case is Failed");
            Assert.assertTrue("Test Case is Failed!", false);
        }
        driver.quit();
    }

    @Test
    public void TestClass5_Test5(){
        String url = "http://demo.automationtesting.in/Index.html";
        WebDriver driver  =  new ChromeDriver();
        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.automationtesting.in/Index.html");
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        String titleAfter = driver.getTitle();
        log.info("title of the page: " + titleAfter);

        if (titleAfter.equalsIgnoreCase("Register")){
            log.info("Test Case is Passed");
            Assert.assertTrue("Test Case is Passed!", true);
        }else{
            log.error("Test Case is Failed");
            Assert.assertTrue("Test Case is Failed!", false);
        }
        driver.quit();
    }
}
