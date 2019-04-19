package coffeeProject;

public class coffeeUser1 {
	
	boolean yes=true;
	boolean no=false;

	
	coffeeMaker coffee = new coffeeMaker();
	coffeeTray tray = new coffeeTray();
	heater heater=new heater();
	indicatorLight light = new indicatorLight();
	liquidControls water= new liquidControls();
	potSensor pot=new potSensor();
	strength strength=new strength();
	coffeeStock item =new coffeeStock();

	
	public void morningRoutine() {
		light.lightOn(yes);
		tray.trayFillforStrong();
		tray.pressureRead();
		water.startFill(100);
		strength.makeDark(75);
		pot.potRemove();
		pot.potAddEmpty();
		item.buyCoffee(1);
		item.extra1("whip", 1.25,1);
		light.lightOn(yes); // have to press power button again...
		tray.emptyTray();
		pot.potAddEmpty();
		tray.trayFillforMed();
		tray.pressureRead();
		water.startFill(100);
		strength.makeMed(100);
		item.bill();
	}
	
	public void case2() {
		water.emptyResevoir();
		light.lightOn(yes);
		pot.potAddEmpty();
		item.buyCoffee(1);
		tray.emptyTray();
		tray.trayFillforStrong();
		tray.pressureRead();
		water.startFill(100);
		strength.makeDark(25);
		/////////////////////////
		light.lightOn(yes);
		pot.potAddEmpty();
		item.buyCoffee(1);
		tray.emptyTray();
		tray.trayFillforLight();
		tray.pressureRead();
		water.startFill(100);
		strength.makeLite(100);
		item.extra2("Cinnamon", 0.75, 1);
		////////////////////////////////////
	light.lightOn(yes);
	pot.potAddEmpty();
	item.buyCoffee(1);
	item.extra1("mocha", 0.90,1);
	tray.emptyTray();
	tray.trayFillforMed();
	tray.pressureRead();
	water.startFill(100);
	strength.makeMed(100);
	
	
	
		item.bill();
	}

} 
