package sweatomatic;
 
import java.awt.*;
import displayomatic.*;

public class SweatTester {

	public static void main(String[] args) {
		ClientBody me = new ClientBody();
		Food Twinky = new Food(3000, -200, "twinky",Color.YELLOW );
		me.eat(Twinky);
		
		Food CheesePuffs = new Food(2000, -500, "cheese puffs", Color.orange );
		me.eat(CheesePuffs);
		me.eat(new Food(2000, 500, "Kale", Color.green ));
		me.eat(new Food(2000, 1500, "Quinoa", Color.magenta ));
		//me.eat(new Food(2000, -500, "cheese puffs", Color.orange ));
		//Drinks d = new Drinks(8,"Dr Die",Color.pink);
		//me.eat(d);
		//me.eat(new Food(2000, -500, "cheese puffs", Color.orange ));
		//me.eat(new Food(2000, -500, "cheese puffs", Color.orange ));
		
		
		//Drinks d = new Drinks(12, "Orange Juice", Color.ORANGE);
		//me.eat(d);
		
		Vitamin theBluePill = new Vitamin(710,"super multi", Color.BLUE);
		me.eat(theBluePill);
		//me.run(3);//*/
		
		Display flabOut = new Display();
		flabOut.display(me);
		
		me.run(100);
		me.yoga(5);
		
		
		System.out.println(me.getNumberOfItems());//*/
		System.out.println(me.getTotalCalories());
		System.out.println(me.getHealthLevel());
	}
}








