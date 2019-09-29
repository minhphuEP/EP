package com.lib;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;
 
public class EnvSetup {
	public void readFile() {
	String FilePath = "/src/test/java/com/data/124config.properties";
	
	InputStream is = EnvSetup.class.getResourceAsStream(FilePath);
	if(is != null) {
	    Properties properties = new Properties();
	    try {
			properties.load(is);
			String Server = properties.getProperty("Server");
			String Username = properties.getProperty("Username");
	    	
			System.out.println("Server: " +Server);
	    	System.out.println("Username: " +Username);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	return;
}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnvSetup refile = new EnvSetup();
		refile.readFile();
		
	}
}

	
	
