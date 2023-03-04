package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
            /*
            Test case 0
            1- launch browser
            2- open url
                        https://admin-demo.nopcommerce.com
            3- provide username - admin@yourstore.com
            4- provide password - admin
            5- click login button
            6- verify the title of dashboard page
            7- verify Dashboard label
             */

        WebDriver driver = new ChromeDriver();

        // 1- launch browser
        driver.get("https://google.com");

        //open url
       driver.get("https://admin-demo.nopcommerce.com");

       // delay the page for 3 seconds
        Thread.sleep(6000);
       // provide username
        driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("admin@yourstore.com");

        // provid password
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("admin");

        //5- click login
        driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

        // get and save actual title
       String act_ttile = driver.getTitle();

       // save expected title of the page
        String exp_title = "Dashboard / nopCommerce administration";

        if(act_ttile.equals(exp_title))
        {
            System.out.println("actual title is "+act_ttile);
            System.out.println("expected title is "+ exp_title);
            System.out.println("_____________________________");
            System.out.println(" title match ");
            System.out.println("_____________________________");
            System.out.println("first test Passed ");
            System.out.println("_____________________________");
        }
        else
        {
            System.out.println("title didnt match");
            System.out.println("_____________________________");
            System.out.println("actual title is "+act_ttile);
            System.out.println("expected title is "+ exp_title);
        }

        // get dashboard label and save it in string files
       String act_label =  driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();

        // get expected label and save in string varaible
        String exp_label = "Dashboard";
        if(act_label.equals(exp_label)){
            System.out.println("actual lebel is "+ act_label);
            System.out.println("expected label is "+exp_label);
            System.out.println("_____________________________");
            System.out.println(" actual and expected labels match ");
            System.out.println("_____________________________");
            System.out.println("second test passed as well ");
        }
        else
        {
            System.out.println("actual lebel is "+ act_label);
            System.out.println("expected label is "+exp_label);
            System.out.println("_____________________________");
            System.out.println(" actual and expected labels DIDN'T match ");
            System.out.println("_____________________________");
            System.out.println("second test FAILD ");

        }



    }
}
