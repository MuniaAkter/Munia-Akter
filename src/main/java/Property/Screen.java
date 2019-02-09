package Property;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screen {
	WebDriver dr;
	Screen(WebDriver dr){
		this.dr=dr;
	}
	public void takephoto() {
		TakesScreenshot ts=(TakesScreenshot)dr;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(source, new File("/Users/muniaakter/Desktop/BTC_180927E/eclispe/020719CodingPractice/pic/facebook.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
