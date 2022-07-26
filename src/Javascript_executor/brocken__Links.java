package Javascript_executor;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brocken__Links {

	public static void main(String args[]) throws InterruptedException, MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogeshwar\\Desktop\\Automation Tool Setup File\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		// what is the tag which has to use link
		List <WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("All links" +Links.size());
		
		//Exact the url from tag (a/img)
		// Eliminate duplicate url
		Set <String> s = new HashSet<>();
		for(WebElement e : Links)
		{
			String link = e.getAttribute("href");
			if (link !=null &&!(link.isEmpty()))
			{
				s.add(link);
			}
		}
		System.out.println(s.size());
		
		// verify the links is open or not
		
		HttpURLConnection connection ;
		int noOFBrockenLinks = 0;
		
		for (String URL :s)
		{
			connection = (HttpURLConnection) new URL(URL).openConnection();
			connection.connect();
			int code=  connection.getResponseCode();
			if (code>400)
			{
				 noOFBrockenLinks++;
				 System.out.println("no of brockenlinks"+URL);
			}
		}
		System.out.println("Number Of Brocken Links"+noOFBrockenLinks);
	}
}
