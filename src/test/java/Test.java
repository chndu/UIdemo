import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.net.URI;
import static com.codeborne.selenide.Selenide.$;
public class Test {


    @org.testng.annotations.Test
    void test() throws InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        String className = this.getClass().getName();
        String an = className + Thread.currentThread().getStackTrace()[4].getMethodName();
        //设置录制视频名称
        capabilities.setCapability("name","测试");
        //构建名
        capabilities.setCapability("build","Demo");
        //启动容器时区
        capabilities.setCapability("timeZone","Asia/Shanghai");

        capabilities.setCapability("maxDockerSeleniumContainers","5");

        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(
                    URI.create("http://192.168.253.133:4444/wd/hub").toURL(),
                    capabilities
            );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();
        driver.get("https://www.baidu.com");
        driver.getWindowHandle();
        driver.findElementById("kw").sendKeys("完美");
        driver.findElementById("su").click();
       //driver.quit();
    }
}
