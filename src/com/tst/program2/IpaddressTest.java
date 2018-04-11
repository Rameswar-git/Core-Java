package com.tst.program2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;


import javafx.scene.transform.Scale;

public class IpaddressTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		SocketAddress soc=new SocketAddress() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		};
		
		int port=IpaddressTest.getPort(soc);
		
		System.out.println(port);
		
//		System.out.println(InetAddress.getByName("10.46.193.48").getHostName());
		
		
//		System.out.println((235/10) % 10);
		
//		InetAddress ip=InetAddress.getLocalHost();
		
//		System.out.println(ip.getLoopbackAddress());
		
//		String hoString=ip.getHostName().toString();
		
//		System.out.println(ip.getHostName()); // imp
		
//		byte[] tem=ip.getAddress();
		
//		BufferedImage img = ImageIO.read(new ByteArrayInputStream(tem));
			
//		System.out.println(img.getType());
		
//		System.out.println(ip.getCanonicalHostName());
		 
//		DateFormat dFormat=new SimpleDateFormat("DD:MMM:YY==>h:mm a");
		
//		String date=dFormat.format(new java.util.Date());
		
//         System.out.println(date);
		

         
         
//               Date curDate = new Date();
         
          
         
//                 System.out.println(curDate.toString());
         
          
         
//                 String DateToStr = DateFormat.getInstance().format(curDate);
         
//                 System.out.println(DateToStr);
         
          
         
//                 DateToStr = DateFormat.getTimeInstance().format(curDate);
         
//                 System.out.println(DateToStr);



		
//		ip.getLoopbackAddress()

//		System.out.println(InetAddress.getLocalHost());
		
//		System.out.println(pingHost("inmchn178",5050,1000));
		
//		boolean reachable = InetAddress.getByName("inmchn178").isReachable(50);
		
//		System.out.println(reachable);
		
//		boolean reachable = InetAddress.getByName("inmchn178").isReachable(20);
		
		
//		boolean reachable=false;
//		while(!reachable){
//			reachable = pingHost("inmchn178",5050,100);				
//			if (reachable){}
//			else{Thread.sleep(600000);}
//			 
//		}
//		System.out.println(reachable);

		
//		System.out.println(reachable);
////		
//		System.out.println("Done");
//
	}
//	
//	
	public static boolean pingHost(String host, int port, int timeout) {
		
	    try (Socket socket = new Socket()) {
	        socket.connect(new InetSocketAddress(host, port), timeout);
	        return true;
	    } catch (IOException e) {
	    	System.out.println(e.getMessage());
	        return false; // Either timeout or unreachable or failed DNS lookup.
	    }
	}
	
	public static int getPort(SocketAddress address) {
	    return ((InetSocketAddress) address).getPort();
	}

}
