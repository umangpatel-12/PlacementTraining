package ConstructorExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TestAddress {
	
	public static void main(String[] args) {
		Address ad1 = new Address("Umang","New Narol",382345);
		System.out.println(ad1);
		
		Address ad = new Address();
		System.out.println(ad);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Society Name :");
		String name;
		try {
			name = br.readLine();
			ad.setAddress(name);
			int pin = Integer.parseInt(br.readLine());
			ad.setPincode(pin);
			System.out.println(ad);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
