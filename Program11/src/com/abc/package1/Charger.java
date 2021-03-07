package com.abc.package1;

public class Charger {
 String brand;
 float voltage;
 
 public Charger(String brand,float voltage)
 {
	 this.brand=brand;
	 this.voltage=voltage;
 }
 
 public String getBrand()
 {
	 return brand;
 }
 
 public float getVoltage()
 {
	 return voltage;
 }
}
