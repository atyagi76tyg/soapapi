import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.apitesting.User;

import pojo.MyPojo;

public class readJSON {
	
	public static void main(String[] args) {
		try
		{
		byte[] jasonData  = 
				Files.readAllBytes(
						Paths.get(("E:\\Workspace2\\apitesting\\Test.json")));
		ObjectMapper mapper = new ObjectMapper();
		MyPojo obj = mapper.readValue(jasonData,MyPojo.class);
		System.out.println(obj.getCurrency());
		System.out.println(obj.getInvoice_settings().getFooter());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}

}
