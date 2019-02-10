package com.test.apitesting;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.logging.log4j.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static Logger logger= LogManager.getLogger(Test.class.getName());
	
	public static void main(String[] args) throws IOException {
	/*  logger.trace("trace level error");
	  logger.info("info level error");
	  logger.debug("debug level error");
	  logger.error(" error level error");
	  logger.fatal(" fatal level error");*/
	
		byte[] jasonData  = 
				Files.readAllBytes(
						Paths.get("E:\\Workspace2\\apitesting\\user.jason"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		User obj = mapper.readValue(jasonData,User.class);
		System.out.println("City : " +obj.getAddress().getCity());
		
		int[] mobile=obj.getMobile();
		for(int a: mobile)
		{
			System.out.println(a);
		}
		
		
		System.out.println("mobile : " +obj.getMobile()[1]);

}
}
