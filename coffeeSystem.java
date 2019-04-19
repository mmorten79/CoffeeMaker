package coffeeProject;

public abstract class coffeeSystem implements Receiptable {
	public double cash; 
	public boolean powerON;
	public String itemName;
	public double itemPrice = 1.10;  //initial cost of one coffee
	public double tax = 0.0925;
	
	public double chargeAmt (double amt) { 
		return (amt * tax) + amt ;
	}
	public void brewCoffee (boolean yes) {
		
	}
	public void bill() {

	}
}
	//May need to make some setters/ mutators to manipulate some of these controls
