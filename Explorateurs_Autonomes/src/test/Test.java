package test;

import data.Map;
import java.util.*;
import gui.Gui;
import gui.Menu;

/* @author antoine
 * this class contain the main
 * this class is for launch the app and make unit test
 */
public class Test {
	public static void main(String[] argv) {
		System.out.println("Test Started");
		// if you want to make your own test just comment my line testMap and create your own method for your test
		//testMap();
		testMenu();
		
		
	}
	public static void testMap() {
		// show the generate map in a gui 
		Map map = new Map();
		map.generateNewMap();
		double tab[][] = map.getTabOfMap();
		System.out.println("map size x=" + map.getWidth() + " and y= " + map.getHeight() + "and the first value is : " + tab[0][0]);
		Gui display = new Gui();
		display.Display(tab,map.getWidth(),map.getHeight());
		
	}
	public static void testMenu() {
		Menu menu = new Menu();
	}

	
	
}