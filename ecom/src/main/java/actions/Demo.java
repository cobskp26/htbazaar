package actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Your authentication key
		String authkey = "2872AobHor4dtr52e9ff69";
		//Multiple mobiles numbers seperated by comma
		String mobiles = "9250813746";
		//Sender ID,While using route4 sender id should be 6 characters long.
		String senderId = "102234";
		//Your message to send, Add URL endcoding here.
		String message = "Test message";
		//define route
		String route="default";

		//Prepare Url
		URLConnection myURLConnection=null;
		URL myURL=null;
		BufferedReader reader=null;

		//encoding message 
		@SuppressWarnings("deprecation")
		String encoded_message=URLEncoder.encode(message);

		//Send SMS API
		String mainUrl="http://sms.ssdindia.com/sendhttp.php?";

		//Prepare parameter string 
		StringBuilder sbPostData= new StringBuilder(mainUrl);
		sbPostData.append("authkey="+authkey); 
		sbPostData.append("&mobiles="+mobiles);
		sbPostData.append("&message="+encoded_message);
		sbPostData.append("&route="+route);
		sbPostData.append("&sender="+senderId);

		//final string
		mainUrl = sbPostData.toString();
		try
		{
		    //prepare connection
		    myURL = new URL(mainUrl);
		    myURLConnection = myURL.openConnection();
		    myURLConnection.connect();
		    reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
		    //reading response 
		    String response;
		    while ((response = reader.readLine()) != null) 
		    //print response 
		    System.out.println(response);
		    
		    //finally close connection
		    reader.close();
		} 
		catch (IOException e) 
		{ 
			e.printStackTrace();
		} 

	}

}
