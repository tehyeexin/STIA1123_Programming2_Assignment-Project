package Assignment_1;

import java.util.Scanner;

public class Finance {
	
	Scanner s = new Scanner(System.in);
	
	double income;
	double inventoryPurchase;
	double incidentalCharges;
	
	public Finance() {
		
	}
	
	public Finance(double income) {
		this.income = income;
		System.out.print("Enter the monthly income : RM");
		income = s.nextDouble();
	}
	
	public Finance(double income, double invPurchase) {
		this.income = income;
		this.inventoryPurchase = invPurchase;
		System.out.print("Enter the monthly income   : RM");
		income = s.nextDouble();
		System.out.print("Enter the monthly purchase : RM");
		income = s.nextDouble();
	}
	
	public Finance(double income, double invPurchase, double charges) {
		this.income = income;
		this.inventoryPurchase = invPurchase;
		this.incidentalCharges = charges;
		System.out.print("Enter the monthly income             : RM");
		income = s.nextDouble();
		System.out.print("Enter the monthly purchase           : RM");
		income = s.nextDouble();
		System.out.print("Enter the monthly incidental charges : RM");
		charges = s.nextDouble();
		System.out.printf("\nTotal profit of the month         : RM%.2f", totalProfit());
	}
	
	public double totalProfit() {
		return this.income - this.inventoryPurchase - this.incidentalCharges;
	}

}
