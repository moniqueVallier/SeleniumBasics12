package seleniumBasics.class1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToMethod {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver drivers=new ChromeDriver();//launching our browser only once

        drivers.get("https://www.facebook.com/");//- to navigate to facebook
        drivers.navigate().to("https://www.google.com/");
        drivers.navigate().back();//navigate back
        drivers.navigate().forward();//navigate forward
        Thread.sleep(2000);//pause the execution for 2 seconds
        drivers.navigate().refresh();//will reload page
        drivers.close();//will close the current tab
        drivers.quit();//will quit the whole browser
    }
}
