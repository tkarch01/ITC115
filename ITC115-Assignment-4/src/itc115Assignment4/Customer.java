package itc115Assignment4;

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

public class Customer 
{
	private String name;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	
	public Customer(String n, String a, String c, String s, String pc )
	{
		this.name = n;
		this.address = a;
		this.city = c;
		this.state = s;
		this.postalCode = pc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getNameAndAddress()
	{
		String nameAndAddress = "\n" + getName() + "\n" 
								+ getAddress() + "\n" 
								+ getCity() + ", " + getState() +" " + getPostalCode() + "\n\n";
		return nameAndAddress;
	}
}
