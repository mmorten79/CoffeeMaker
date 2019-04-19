package coffeeProject;

public class coffeeStock extends coffeeMaker implements Receiptable {
	
	double cash;
	double coffee = super.itemPrice;
	double coffeePurchased =0.00;
	String itemName;
	////////////////////////////////////////
	String extra1Desc="";
	double extra1=0.00;
	////////////////////////////////////////
	String extra2Desc="";
	double extra2=0.00;
	////////////////////////////////////////
	String extra3Desc="";
	double extra3=0.00;
	////////////////////////////////////////
	String extra4Desc="";
	double extra4=0.00;
	///////////////////////////////////////
	String extra5Desc="";
	double extra5=0.00;
	///////////////////////////////////////
	String extra6Desc="";
	double extra6=0.00;
	///////////////////////////////////////
	String extra7Desc="";
	double extra7=0.00;
	
public static double amountTotal;
	
	public coffeeStock() {
		// TODO Auto-generated constructor stub
	}

	public coffeeStock(int cofweight, boolean pow) {
		weight=cofweight;
		powerStatus=pow;
	}
	
	public coffeeStock(String itemname,  double extra1 ) {
		itemName=itemname;
		itemPrice=extra1 ;	
		
		
		}
	
	public void setItemName (String itemname) {
		itemName=itemname;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	
	public double buyCoffee(int x) {   
		if (x>0) {
			this.coffee = this.coffee *x;
			coffeePurchased ++;
			
		}
		return coffee;  
	}
	
	
	public void bill() {
		
		System.out.printf("\nCoffees: \t \t \t \t $%.2f \n", ( this.coffee*coffeePurchased));
		System.out.println("Extras:"   + "\t \t \t \t" + (extra1 + "(" + extra1Desc + ")" + extra2 +"(" + extra2Desc + ")")); // can add more etras and descriptions to get more addons to print.
																																																		  //or a loop to print only given certain conditions.
		
		System.out.print(" Tax amount \t \t \t " + (super.tax * 100) + "%");
		System.out.printf("\t");
		System.out.printf("\n Grand total : \t  \t \t $%.2f", super.chargeAmt(itemPrice +coffee + extra1 + extra2 + extra3 + extra4 + extra5 + extra6 + extra7) );
		System.out.printf("\n \n \n");

	}

	public String type() {
		return this.itemName;
	}
	

	
	public  void extra1 (String ex1d, double ex1, int exAmt) {
		extra1Desc=ex1d;
		extra1=(ex1*exAmt);
		//return extra1;
	}
	
	public  void extra2 (String ex2d, double ex2, int exAmt) {
		extra2Desc=ex2d;
		extra2=(ex2*exAmt);
		//return extra1;
	}
	
	public  void extra3 (String ex3d, double ex3, int exAmt) {
		extra3Desc=ex3d;
		extra3=(ex3*exAmt);
		//return extra1;
	}
	
	public  void extra4 (String ex4d, double ex4, int exAmt) {
		extra4Desc=ex4d;
		extra4=(ex4*exAmt);
		//return extra1;
	}
	
	public  void extra5 (String ex5d, double ex5, int exAmt) {
		extra5Desc=ex5d;
		extra5=(ex5*exAmt);
		//return extra1;
	}
	public  void extra6 (String ex6d, double ex6, int exAmt) {
		extra6Desc=ex6d;
		extra6=(ex6*exAmt);
		//return extra1;
	}
	public  void extra7 (String ex7d, double ex7, int exAmt) {
		extra7Desc=ex7d;
		extra7=(ex7*exAmt);
		//return extra1;
	}
}
