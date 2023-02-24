import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the webDriver is located

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        // create an instance of webDriver
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
