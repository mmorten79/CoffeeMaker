package coffeeProject;

public class potSensor extends coffeeMaker implements PowerAble, weightSensor, NeedsBoiling {

	static double potSensorWeight;
	static double potTemp;
//	static boolean powerUp = true;
	public potSensor() {
		 
	}

	public potSensor(double cofweight ) {
		super(cofweight );
		potSensorWeight=cofweight;
		
		 
	}
	 
	public void potAdd() {
		potSensorWeight=10.50;
		
	}
	
	public void potRemove() {
		potSensorWeight=0;
		super.powerFlipOff();
		
	}
	
public void potAddEmpty() {
	potSensorWeight=0;
	super.weight=0;
	//super.powerToggle(true);
}

public void potAddwCoffee() {
	potSensorWeight=super.weight;
	//super.powerToggle(true);
}

	
	public void pressureRead() {
		if (potSensorWeight>0 ) {
		System.out.println("Pot Detected");
	}
		else	if (potSensorWeight==0) {
	System.out.println("Pot has been removed.");
		}
	}
	
	public double currentLBS() {
		return super.weight;
	}
	
	public double currentTemp() {
		return potTemp;
	}
	
	public void boilingPoint() {
		potTemp=NeedsBoiling.FINAL_TEMP + 5 ;
		System.out.println("Systems reads boiling at " + potTemp + " degrees");
	}
}
