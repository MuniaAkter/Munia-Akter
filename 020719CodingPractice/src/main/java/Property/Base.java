package Property;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Property.OurListener.class)
public class Base {
	
	WebDriver dr;
	@Test
	public void openBrowser() throws IOException {
		
		PropertyFile pf= new PropertyFile();
		Properties prop= pf.readfile();
		String s= prop.getProperty("driver");
		
		
		if (s.equals("chromedriver")) {
			dr= new ChromeDriver();
		}
		else if (s.equals("Firefoxdriver")) {
			dr= new FirefoxDriver();
			
		}
		else {
			dr= new ChromeDriver();
		}
		
		dr.get(prop.getProperty("url"));
		Screen screen = new Screen(dr);
		screen.takephoto();
		
		
		
	}
	
	@Test
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		dr.quit();
	}

}
