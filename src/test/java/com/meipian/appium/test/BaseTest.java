package com.meipian.appium.test;

import com.meipian.appium.utils.BaseAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by spook on 2017/7/20.
 */
public class BaseTest extends BaseAppium {


    public  void templateTest(String corpus,String article) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//隐式等待
        //通过resource name定位元素
        driver.findElement(By.name("随便看看")).click();
        String out = driver.getContext();
        //System.out.println(out);
        driver.findElement(By.name("搜索用户和文章")).click();
        WebElement inputBox = driver.findElement(By.name("搜索用户和文章"));
        inputBox.sendKeys("1888036");


        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
        //System.out.println(driver.currentActivity());
        //xpath=//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")).click();

        driver.findElement(By.name(corpus)).click();

        driver.findElement(By.name(article)).click();



        Thread.sleep(500);

    }

    @Test
    public  void templateTestJQ() throws InterruptedException{
        this.templateTest("假期","假期模板");
    }

    @Test
    public  void templateTestKA() throws InterruptedException{
        this.templateTest("可爱","可爱模板");
    }

    @Test
    public  void templateTestML() throws InterruptedException{
        this.templateTest("朦胧","朦胧模板");
    }

    @Test
    public  void templateTestJD() throws InterruptedException{
        this.templateTest("经典","经典模板");
    }
    @Test
    public  void templateTestJR() throws InterruptedException{
        this.templateTest("节日","节日模板");
    }

}