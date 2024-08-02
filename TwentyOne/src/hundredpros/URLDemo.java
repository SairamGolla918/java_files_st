package hundredpros;


import java.net.*;

public class URLDemo {

	public static void main(String[] args) 
	{
		
		try{ 
			URL url=new URL("https://academy.studenttribe.in/user/home/startup"); 
			 
			System.out.println("Protocol: "+url.getProtocol()); 
			System.out.println("Host Name: "+url.getHost()); 
			System.out.println("Port Number: "+url.getPort()); 
			System.out.println("File Name: "+url.getFile()); 
			
			InetAddress ip=InetAddress.getByName("www.studenttribe.in"); 
			 
			System.out.println("Host Name: "+ip.getHostName()); 
			System.out.println("IP Address: "+ip.getHostAddress());
			 
			}catch(Exception e){System.out.println(e);}
	}

}
