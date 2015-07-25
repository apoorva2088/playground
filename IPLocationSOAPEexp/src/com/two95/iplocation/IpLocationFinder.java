package com.two95.iplocation;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IpLocationFinder {

	public static void main(String[] args) {
		
		if(args.length != 1){
			System.out.println("Wrong IP Address");
		}
		else{
			String ipAddress = args[0];
			GeoIPService geoIPService= new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			String geoIP1 = geoIP.getCountryName();
			System.out.println(geoIP1);
			
			
		}
		
		
		
		

	}

}
