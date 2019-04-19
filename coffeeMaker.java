package coffeeProject;

public class coffeeMaker extends coffeeSystem implements  PowerAble {

	static double  weight = 0; 
	static boolean powerOn=true;
	static boolean powerOff=false;
	static boolean powerStatus = true;

	
	
	public coffeeMaker() {
		
	}
	public coffeeMaker(double cofweight ) {
		weight=cofweight;
	}
	
	
	public coffeeMaker(String itemName,  double itemPrice ) {
				super.itemName=itemName;
				super.itemPrice=itemPrice;
	}
	
	public coffeeMaker(String itemName) {
		super.itemName=itemName;
	}
	 
	

	public void brewCoffee (boolean yes) {
		if (this.powerStatus==true) {
			System.out.println("Brewing your selection...");
		}
		if (this.powerStatus==false) {
			powerFlip();
			System.out.println("System starting, please select strength");
		}
	}

	
	public void checkWeight() {
		
	}
	
	public boolean powerFlip () {
	powerStatus= powerOn;
		return powerStatus;
	}
	public boolean powerFlipOff() {
		powerStatus=powerOff;
		return powerStatus;
	}
	//This  is the poweer system. "powerFlip/powerFlipOff. This  is an interface, for power. any use of this interface can be code cycle the "Coffee Maker" system. 
	//Basically the same varible. 
	
	public void powerToggle (boolean x) {
		
		if (x==powerOn) {
		powerFlip();
		}
		 if  (x==powerOff) {
				System.out.println("System powering down.");
			 powerFlipOff();
		 }
	}
	
	public boolean getPowerToggle() {
		
		return powerStatus;
	}
	
	
	

}



