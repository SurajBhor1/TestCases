package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataRead {
	
	public String user;
	public String pass;
public String getData() throws IOException {
	
	Properties prop=new Properties();
	FileInputStream read=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\setUp.properties");
	
	prop.load(read);
	 
	String str=(String) prop.get("url");
this.user=(String) prop.get("user");
this.pass=(String) prop.get("pass");
read.close();
return str;



}
}
