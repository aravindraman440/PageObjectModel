package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiseFile {
public static void main(String[] args) throws IOException {
	FileInputStream stream=new FileInputStream("./src/main/resources/config.properties");
	
	Properties prop =new Properties();
	
	prop.load(stream);
	
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
}
}
