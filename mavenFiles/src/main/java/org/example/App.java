package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");

        Thread.sleep(5000);
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");

     driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

     String title = driver.getTitle();
     String exp_title = "OrangeHRM";
        System.out.println(title);
        if(exp_title.equals(title)){
            System.out.println("title match");
            System.out.println("title is "+ title);
        }else
        {
            System.out.println("title doesn't match");
        }
Thread.sleep(5000);
       String label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        System.out.println(label);

        if(label.equals("Dashboard")){
            System.out.println("label is matched ");
            System.out.println(" label is "+ label);
            System.out.println("Test Passed");
        } else
        {
            System.out.println("Test Failed ");
        }



    }
}
