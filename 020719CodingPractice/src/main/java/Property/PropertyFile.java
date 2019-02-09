package Property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public Properties readfile() throws IOException {
		
			Properties p= new Properties();
			FileInputStream io= new FileInputStream("read.properties");
			p.load(io);
		 
			return p;
	}
	

}
