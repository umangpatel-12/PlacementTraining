package CarRental;

import java.util.Scanner;

public class PrintCarRent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Car Type : ");
        CarRental cr = new CarRental();
        cr.setCarID(0);
        cr.setCarType("SUV");
        System.out.println(cr.getRent());
    }
}
