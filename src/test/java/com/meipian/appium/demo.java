package com.meipian.appium;

/**
 * Created by spook on 2017/7/19.
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo {

    public static void main(String[] args) throws Exception {
        AndroidDriver driver;
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName", "Appium");//appium做自动化
//      cap.setCapability("app", "C:\\software\\jrtt.apk");//安装apk
//      cap.setCapability("browserName", "chrome");//设置HTML5的自动化，打开谷歌浏览器
        cap.setCapability("deviceName", "58f5d01c");//设备名称
        cap.setCapability("platformName", "Android"); //安卓自动化还是IOS自动化
        cap.setCapability("platformVersion", "4.4"); //安卓操作系统版本
//      cap.setCapability("udid", "192.168.56.101:5555"); //设备的udid (adb devices 查看到的)
        cap.setCapability("appPackage", "com.lanjingren.ivwen");//被测app的包名
        cap.setCapability("appActivity", "com.lanjingren.ivwen.ui.splash.SplashActivity");//被测app的入口Activity名称
        cap.setCapability("unicodeKeyboard", "True"); //支持中文输入
        cap.setCapability("resetKeyboard", "True"); //支持中文输入，必须两条都配置
        cap.setCapability("noSign", "True"); //不重新签名apk
        cap.setCapability("newCommandTimeout", "30"); //没有新命令，appium30秒退出
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);//把以上配置传到appium服务端并连接手机
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//隐式等待
//通过resource name定位元素
        driver.findElement(By.name("随便看看")).click();
        String out = driver.getContext();
        System.out.println(out);
        driver.findElement(By.name("搜索用户和文章")).click();
        WebElement inputBox = driver.findElement(By.name("搜索用户和文章"));
        inputBox.sendKeys("1888036");


        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
        System.out.println(driver.currentActivity());



    }

}