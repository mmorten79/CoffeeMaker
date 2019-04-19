package coffeeProject;

public class CoffeeUser {

	public static void main(String[] args) {
		
		boolean yes=true;
		boolean no=false;

		
	/*This creates the coffeeLady object which has access to all classes based on this coffeeUser1 class. 
	 * the "coffeeUser1 class has objects from all class in it, to so circumvent some of the restrictions that are inherit when dealing with inheritance.
	 * However, in order for the power system to work properly, inheritance is completely necessary 
		*/
		coffeeUser1 coffeeLady = new coffeeUser1();
		
		coffeeLady.morningRoutine();
		coffeeLady.case2();

		
	}
	
	
	

}
