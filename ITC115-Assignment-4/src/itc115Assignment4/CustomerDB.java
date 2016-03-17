/*
 * ITC 115 W16 - 3182
 * Assignment 4
 * 
 * Thomas Karchesy
 * February 1, 2016
 * 
 * IDE: Eclipse IDE for Java Developers
 * JDK: 1.8.0_66 
 */

package itc115Assignment4;

import java.util.ArrayList;

public class CustomerDB {
	public static Customer getCustomer(int customerNumber)
	{

		Customer C = new Customer(null, null, null, null, null);

		if (customerNumber == 1001){
			C.setName("Barbara White");
			C.setAddress("2400 Richmond Parkway #3423");
			C.setCity("Bristol");
			C.setState("CT");
			C.setPostalCode("06010");
		}else if (customerNumber == 1002) {
			C.setName("Karl Vang");
			C.setAddress( "327 Franklin Street");
			C.setCity("Edina");
			C.setState( "NM");
			C.setPostalCode( "55435");	
		}else if (customerNumber == 1003){
			C.setName("Rohda Chavan");
			C.setAddress("518 Commanche Dr");
			C.setCity("Greensboro");
			C.setState("NC");
			C.setPostalCode("27410");
		}
			
		return C;
	}

}
