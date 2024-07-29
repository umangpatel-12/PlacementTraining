package ConstructorExample;

public class Address {
	
	//ToStringArrayofObjects
	
	private String name,address;
	private int pincode;
	
	
	
	public Address(String name, String address, int pincode) {
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		
	}
	public Address() {
		this.name = "Patel Umang";
		this.address = "A-1,Mahaveer Society";
		this.pincode = 382345;
		
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
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}

	
	

}
