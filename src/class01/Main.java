package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}