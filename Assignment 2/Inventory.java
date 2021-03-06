package Assignment_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Inventory { 
	
	Scanner s = new Scanner(System.in);
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	String material;
	int quantity;
	double price;
	
	public Inventory() { //constructor with no argument
		System.out.println("---------- INVENTORY ----------");
		System.out.println("Please enter the inventory details.\n");
		
		System.out.print("Enter material purchased         : ");
		this.material = s.nextLine();	
		System.out.print("Enter quantity purchased         : ");
		this.quantity = s.nextInt();	
		System.out.print("Enter unit price of the material : RM");
		this.price = s.nextDouble();	
		
		System.out.println("\nPlease enter 0 to confirm.");
		int confirm = s.nextInt();
		if(confirm == 0) {
			System.out.println("Inventory details updated successfully.");
			System.out.println();
			printInfo();
		}
		else {
			System.out.println("Inventory details updated unsuccessfully. Please exit and re-enter.");
		}
	}
	
	public double totalPurchase() { //calculate total purchase of material
		return this.quantity * this.price;
	}
	
	//2.2 - Polymorphism
	public void printInfo() { //overriding
		System.out.println("- Inventory Details -");
		System.out.println("Name of material     : " + getMaterial()
						 + "\nQuantity of purchase : " + getQuantity()
						 + "\nPrice of purchase    : RM" + df2.format(getPrice())
						 + "\nTotal purchase       : RM" + df2.format(totalPurchase()));
	}
	
	//2.3 - Encapsulation
	public void setMaterial (String mat) {
		this.material = mat;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setQuantity (int qty) {
		this.quantity = qty;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}

}
