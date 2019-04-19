package coffeeProject;

public class heater extends potSensor {
	
	double heatLBS;
boolean powerHere =false;
	public heater() {
		// TODO Auto-generated constructor stub
	}

	public heater(int cofweight, boolean pow) {
		super(cofweight);
		heatLBS=cofweight;
		powerHere=pow;
		// needs a variable for power status to not work is power is fi
		// TODO Auto-generated constructor stub
	}

	public void powerSafe () {
		if( potSensor.potTemp>100.0) {
			int temp = (int)potSensor.potTemp;
			for (int i =temp; i>100; i--) {
				System.out.println("Reducing temp to boiling. Current Temp: " +  temp);
					setTemp(temp-1);
			}
		}
	} 
	
	public void setTemp(double x) {
		potSensor.potTemp=x;
		
	}
	public void warmerStart() {
		
		if (super.getPowerToggle()==false || potSensor.potSensorWeight<=0.0 ) {
			System.out.println("System is off");
		}
		
		else if (powerStatus=true   && potSensor.potSensorWeight>=1.00 ) {
			System.out.println("Warmer started...");
			setTemp(50);
			}
		else if (powerStatus=false || potSensor.potSensorWeight==0.0 ) {
			System.out.println("Warmer off");
			setTemp(0);
			
		}
		
	      }
}
