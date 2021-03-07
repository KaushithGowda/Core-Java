package com.abc.package1;

public class Launch {

	public static void main(String[] args) {
        
		//before losing
		Mobile m = new Mobile();
		System.out.println(m.os.getName());//Andriod
		System.out.println(m.os.getSize());//512
		
		Charger c = new Charger("Samsung",5.2f);
		m.hasA(c);//samsung //5.2
		
		//after losing
		//Mobile m = new Mobile();
       // m=null;		
		//System.out.println(m.os.getName());//Exception
		//System.out.println(m.os.getSize());
		
//		Charger c = new Charger("Samsung",5.2f);
//	    System.out.println(c.getBrand());
//	    System.out.println(c.getVoltage());
		
	}

}
