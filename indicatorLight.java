package coffeeProject;

public class indicatorLight extends coffeeMaker {
	private String on;

	public indicatorLight() {
		// TODO Auto-generated constructor stub
	}

	public indicatorLight(int cofweight, boolean pow) {
		super(cofweight );
		// TODO Auto-generated constructor stub
	}
	
	public void lightOn(boolean x) {
		if(x) {
			super.powerFlip();
			on="yes";
			System.out.println("Is light indicator on: " + on);
		}
		
		if (!x) {
			super.powerFlipOff();
			on="no";
			System.out.println("Is light indicator on: " + on);
		}
	}

}
