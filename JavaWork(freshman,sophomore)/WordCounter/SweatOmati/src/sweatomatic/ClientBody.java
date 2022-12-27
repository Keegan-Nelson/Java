package sweatomatic;

import java.awt.*;
import java.util.*;

import displayomatic.*;

public class ClientBody implements Displayable {
	private int totalCalories;
	private int numberOfItems;
	private int healthLevel;
	private int totalHoursYoga;
	private ArrayList<String> names;
	private ArrayList<Color> colors;
	private final int CaloriesPerMile = 100;

	public ClientBody(){
		totalCalories = 0;
		numberOfItems = 0;
		healthLevel = 0;
		totalHoursYoga = 0;
		names = new ArrayList<String>();
		colors = new ArrayList<Color>();
	}
	
	public void eat(Eatable item){
		numberOfItems++;
		totalCalories = totalCalories + item.getCalories();
		healthLevel += item.getHealthValue();
		names.add(item.getName());
		colors.add(item.getColor());
	}
	
	public int getTotalCalories() {
		return totalCalories;
	}

	public int getHealthLevel() {
		return healthLevel ;
	}

	public int getNumberOfItems() {
		return numberOfItems ;
	}
	public int getTotalHoursYoga() { 
		return totalHoursYoga; 
	}

	public ArrayList<Color> getColorList() {
		return colors;
	}

	public ArrayList<String> getNameList() {
		return names;
	}

	public void run(int miles) {
		totalCalories = totalCalories - miles * CaloriesPerMile;
		
	}
	public void yoga(int hours){
		totalHoursYoga = hours; 
		healthLevel = healthLevel + hours *5; 
		
	}

}
