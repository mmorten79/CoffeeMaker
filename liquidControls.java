package coffeeProject;

public class liquidControls extends strength {
	static boolean reserveFull = false;
	static int h20weight =0;
	 double weight=super.weight;

	public liquidControls() {
		
	}

	public liquidControls(double cofweight, boolean pow) {
		super(cofweight, pow);
		
	}
	
	public void emptyResevoir() {
		System.out.println("Removing water from reservior");
		this.h20weight=0;
		weight=0.00;
	}
	
	
	int i = 0;
	public void startFill(int x) { 
		
		 if (super.powerStatus==false) { 		
				System.out.println("Error");
			} 
		
		 else if (x<=100 && super.powerStatus==true && liquidControls.reserveFull==false) {
			System.out.println("Water filling into reservior");
		for(i =0; i<x; i=i+5) {
		System.out.println("Filling reservoir at .33 cups per second. Currently at : " +(i+h20weight)+ "%" );
	}
		}
		this.h20weight=this.h20weight + x;
		weight=(double)h20weight;
	
	 if (this.h20weight==100 && super.powerStatus==true && liquidControls.reserveFull==false ) {	
		System.out.println("Water Reserve is full, next phase: ");
		
			liquidControls.reserveFull=true;
		}
	 else if (this.h20weight<100 && super.powerStatus==true && liquidControls.reserveFull==false ) {
	 System.out.println((this.h20weight ) + "% full"); 
	 }
		

	else if (this.h20weight>100)  {
		System.out.println("Please empty the reserve before trying to fill.");
		
	}

}
}