package itsudparis.application;

import java.util.ArrayList;


public class InitIndividuals {
	private static ArrayList<String> capteurs = new ArrayList<String>();
	
	
	
	public static String getSensors(int i) {
		  capteurs.add("ph1");
		  capteurs.add("ph2");
		  capteurs.add("ir1");
		  capteurs.add("fo1");
		  capteurs.add("fo2");
		  capteurs.add("di3");
		  capteurs.add("di4");
		  capteurs.add("ph3");
		  capteurs.add("ph4");
		  capteurs.add("ph5");
		  capteurs.add("ph6");
		  capteurs.add("co1");
		  capteurs.add("co2");
		  capteurs.add("co3");
		  capteurs.add("so1");
		  capteurs.add("so2");
		  capteurs.add("di1");
		  capteurs.add("di2");
		  capteurs.add("te1");
		  capteurs.add("fo3");
		  
		  return capteurs.get(i);
		  
	}
}
