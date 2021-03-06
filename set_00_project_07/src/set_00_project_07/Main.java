package set_00_project_07;

import set_00_project_07.Tuna;
import set_00_project_07.Food;
import set_00_project_07.Potpie;
import set_00_project_07.Fatty;

public class Main {

	public static void main(String[] args) {
		
		// Tune of the Food type  
		Food foo = new Tuna();
		
//		Will throw an error because Food is an abstract class
//		Food foo = new Food();
		
		// Polymorphic array example
		Food bar[] = new Food[2];
		
		bar[0] = new Potpie();
		bar[1] = new Tuna();
		
		Fatty dude = new Fatty();
		
		// Eat it all
		for(int i = 0; i < bar.length; i++) {
//			bar[i].eat();
			dude.digest(bar[i]);
		}
		
		
	}

}
