package model;

import java.util.ArrayList;

public class CountryData {
	public ArrayList<Country> countries;
	
	public CountryData() {
		countries = new ArrayList<>();
	}
	
	public String getText() {
		String text = "Masculino \n";
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldMan()+" "+c.getSilverMan()+" "+c.getBronzeMan();
		}
		
		text += "\n\nFemenino \n";
		
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldWoman()+" "+c.getSilverWoman()+" "+c.getBronzeWoman();
		}
		
		text += "\n\nCombinado \n";
		
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldTotal()+" "+c.getSilverTotal()+" "+c.getBronzeTotal();
		}
		return text;
	}
		
}
