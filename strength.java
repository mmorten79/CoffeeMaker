package coffeeProject;

public class strength extends coffeeMaker implements Sprayer, PressureValve {
	
	int valveSet;
	int i=0;
	int j=0;
	int k=0;
int amount=0;
public strength(){
	super();
}

public strength(String itemName ) {
	super(itemName);
	super.itemName=itemName;
	
	
	
	
	}
	
strength(double strlbs, boolean pow){
	super(strlbs); // using the supers instance variable, but in this class.
	 
	
}
	
/////////////////////  SPRAY CONTROLS /////////////////////////////////	
	//needs a water pressure valve.... making this interface
	public void sprayControl(double x) {
		
		 if (super.powerStatus==false) {	
			System.out.println("CANNOT FILL, SYSTEM IS OFF");
			}
		
		 else if (x>=50 && super.powerStatus==true	) {
		this.valveOpenFull(x);
		}
		if (x < 50 ) {
		this.valveOpenHalf(x);
		}
		
		 if (this.weight==100 || this.weight==0.0) {
			this.valveClose();
		}
	}
	// This code can detect if the cup, or weight is removed form the heater, while the cup is being filled..
/////////////////////////// VALVE OPEN FULLY /// //////////////////////////////////		
	
	
	
	public void valveOpenFull(double x) {
	
		weight= weight + x;
		 amount=amount+(int)x;
		
		for ( i =10; i<x; i=i+10) {
		System.out.println("Brewing..... Certainly at + " + i + "%.");
	}
		if(amount<100) {
		System.out.println("pot is currently:" +amount +"% full");
		
		}
		else {
			System.out.println("pot is currently:" + 100 +"% full");
			amount =0;
		}
		 if ( weight>=100) {
				System.out.println("Coffee is done");
				weight=0;
		 }
		 else if (weight<100) {
			System.out.println("System interrupted. pleae return pot and add 100ml of water ");
			this.valveClose();
		}
		else if ( weight==0.0) {
			super.powerToggle(false);
			}
		
		 }

/////////////  HALF OPEN VALVE //////////////////////////////////////////////	
	public void valveOpenHalf(double x) {
		weight= weight + x;
		 amount=amount+(int)x;
		
		for ( i =10; i<x; i=i+10) {
		System.out.println("Brewing..... Certainly at + " + i + "%.");
	}
		if(amount<100) {
		System.out.println("pot is currently:" +amount +"% full");
		
		}
		else {
			System.out.println("pot is currently:" + 100 +"% full");
			amount =0;
		}
		 if ( weight>=100) {
				System.out.println("Coffee is done");
				weight=0;
		 }
		 else if (weight<100) {
			System.out.println("System interrupted. pleae return pot and add 100ml of water ");
			this.valveClose();
		}
		else if ( weight==0.0) {
			super.powerToggle(false);
			}
		
		 }

		
		
		/*
		for ( i =10; i<x; i=i+10) {
			System.out.println("Reducing water, ... still brewinng..... currently more than " + ( valveSet +i ) +  "%...");
		}
		valveSet=valveSet+ (int)x;
			if (valveSet<100 || this.weight<100) {
				System.out.println("System interrupted. pleae return pot and add 100ml of water ");
			super.powerToggle(false);
			}
			 if (valveSet==100) {
				System.out.println("Coffee is done");		
			}
	}
	*/
	////////////// CLOSING THE VALVE METHOD ///////////////////////////////////
	public void valveClose() {
	valveSet=0;
	System.out.println ("Valve is closed");
	}

/////////////////   MAKING DARK COFFEE ////////////////////////////////
	public void makeDark (int x) {
		 if (super.powerStatus==false) {	
				System.out.println("System is shutdown");
				}
		 else {
		System.out.println("Making  Dark coffee" );
		sprayControl(x);
		 }
	}

///////////////   MAKING MEDIUM COFFEE ////////////////////////////////////////////
	public void makeMed(int x) {	
		 if (super.powerStatus==false) {	
				System.out.println("System is shutdown");
				}
		 else {
		System.out.println("Making medium brew" );
		sprayControl(x);
		 }
	}
///////////////   MAAKING LIGHT COFFEE ////////////////////////////////////////////		
	public void makeLite(int x) {
			 if (super.powerStatus==false) {	
				System.out.println("System is shutdown");
				}
		 else {
		System.out.println("Making light coffee" );
		sprayControl(x);
		 }
	}

}
