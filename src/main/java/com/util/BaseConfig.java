package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	public static String getValue(String value) throws IOException {
		//code = how to read notepad config data==>Java dev class = Property
		String path = "./config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties obj = new Properties();
		obj.load(fis);
		//System.out.println(obj.get(value));
		return obj.get(value).toString();
	}
	public static void main(String[] args) throws Exception{
		BaseConfig.getValue("user");
	}
}
