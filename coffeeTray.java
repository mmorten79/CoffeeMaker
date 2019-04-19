package coffeeProject;

public class coffeeTray extends coffeeMaker implements weightSensor{
	
	double weight=0.0;
	double potWeight = 0.0;
	
	
	public coffeeTray() {
	}
	
	public void pressureRead() {
		if (this.potWeight>0 && super.powerStatus==true ) {
			System.out.println("Basket is ready...");
		}
			else if (this.potWeight>0 && super.powerStatus==false) {
			System.out.println("Please return power ....");
		}
			else if (this.potWeight==0) {
				System.out.println("Please add coffee before starting system");
			}
	}
	
	 
	public void emptyTray() {
		potWeight=0.00;
	}
	
	
	public void trayFillforStrong() {
		potWeight=100.0;
		
		
	}
	public void trayFillforMed() {
		potWeight=75.5;
	}
	public void trayFillforLight() {
		potWeight=25.5;
	}

}
