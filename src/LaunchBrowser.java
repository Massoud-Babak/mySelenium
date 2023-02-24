import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the webDriver is located

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");

        // create an instance of webDriver
        WebDriver driver = new ChromeDriver();

        // to open the google.com
        driver.get("https://www.google.com");

            // then from google it will navigate to facebook
     driver.navigate().to("https://facebook.com");

     // hold the page for 3 seconds
        Thread.sleep(3000);

        // will navigate back to google from facebook page
     driver.navigate().back();

     // will hold in google for 3 seconds again
        Thread.sleep(3000);

        // after 3 second hold in google page, will navigatge back to facebook page
        driver.navigate().forward();

        // to refresh the page

        driver.navigate().refresh();

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
