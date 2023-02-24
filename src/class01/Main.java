package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        // to open the Website twitter.com
        driver.get("https://facebook.com");

        // get the current URL That is there in the browser

        String URL = driver.getCurrentUrl();

        // Print out the url
        System.out.println(URL);

        // to get the title of the webpage
        String title = driver.getTitle();
        System.out.println("title of the page is "+ title);

        // to hold the browser for 3000 milSecond = 3 second.
        Thread.sleep(3000);

        // to close the browser
        driver.quit();
    }
}