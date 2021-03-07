package com.abc.InheritanceDelegation;

public class Bike {
    String brand;
    String model;
    int Hp;
    
    public Bike(String brand,String model,int Hp)
    {
    	this.brand=brand;
    	this.model=model;
    	this.Hp=Hp;
    }
    
    public String getBrand()
    {
        return brand;
    }
    
    public String getModel()
    {
	    return model;
    }
    
    public int getHp()
    {
    	return Hp;
    }
}

