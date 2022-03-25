package seleniumBasics.class1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;

public class maximizeWindow {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver drivers = new ChromeDriver();//launching our browser only once
        drivers.navigate().to("https://www.google.com/");
        drivers.manage().window().maximize();
        drivers.manage().window().fullscreen();

        }
    }
