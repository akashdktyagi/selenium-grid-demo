package com.yantraQA;

import lombok.extern.log4j.Log4j2;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

@Log4j2
public class TestClass1 extends TestBase{

    @Test
    public void TestClass1_Test1() throws MalformedURLException {
        String url = "http://demo.automationtesting.in/Index.html";
        //WebDriver driver  =  new ChromeDriver();

        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(url);
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public void TestClass1_Test2() throws MalformedURLException {
        String url = "http://demo.automationtesting.in/Index.html";
        //WebDriver driver  =  new ChromeDriver();

        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(url);
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
    public void TestClass1_Test3() throws MalformedURLException {
        String url = "http://demo.automationtesting.in/Index.html";
        //WebDriver driver  =  new ChromeDriver();

        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(url);
        log.info("Browser Navigated. URL: " + url);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public void TestClass1_Test4() throws MalformedURLException {
        String url = "http://demo.automationtesting.in/Index.html";
        //WebDriver driver  =  new ChromeDriver();

        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(url);
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
    public void TestClass1_Test5() throws MalformedURLException {
        String url = "http://demo.automationtesting.in/Index.html";
        //WebDriver driver  =  new ChromeDriver();

        log.info("Browser opened!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(url);
        log.info("Browser Navigated. URL: " + url);

        WebElement email = driver.findElement(By.id("email"));
        log.info("Email");

        email.sendKeys("akashdktyagi@gmail.com");
        log.info("enter email: akashdktyagi@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
