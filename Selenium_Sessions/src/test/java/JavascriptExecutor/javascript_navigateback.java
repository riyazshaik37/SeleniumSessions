package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_navigateback {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('enterimg').click()");
        Thread.sleep(5000);
        //navigate back
        js.executeScript("window.history.back()");
        Thread.sleep(2000);
        js.executeScript("window.history.forward()");


    }
}
