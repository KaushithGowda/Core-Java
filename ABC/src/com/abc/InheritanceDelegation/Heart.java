package com.abc.InheritanceDelegation;

public class Heart {
  
	String colour;
	int pulseRate;
  
	public Heart(String colour,int pulseRate)
	{
		this.colour=colour;
		this.pulseRate=pulseRate;
	}
	
	public String getColour()
	{
		return colour;
	}
	
    public int getPulseRate()
    {
	return pulseRate;
    }
}
