package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CountryData {
	public ArrayList<Country> countries;
	
	public CountryData() {
		countries = new ArrayList<>();
	}
	
	public void sort1() {
		Collections.sort(countries, new Comparator<Country>() {
			@Override
			public int compare(Country A, Country B) {
				if (B.getGoldMan() != A.getGoldMan()) {
					return B.getGoldMan() - A.getGoldMan();
				} else if (B.getSilverMan() != A.getSilverMan()) {
					return B.getSilverMan() - A.getSilverMan();
				} else if (B.getBronzeMan() != A.getBronzeMan()) {
					return B.getBronzeMan() - A.getBronzeMan();
				} else {
					return B.getName().compareTo(A.getName());
				}
			}
		});
	}
	
	public void sort2() {
		Collections.sort(countries);
	}
	
	public void sort3() {
		
		int a1, a2, a3;
		int b1, b2, b3;
		
		Country aux;
		
		String a4, b4;
		
		for(int i=0; i<(countries.size()-1); i++) {
			for(int j=(i+1); j<countries.size() ; j++) {
				a1 = countries.get(i).getGoldTotal();
				b1 = countries.get(j).getGoldTotal();
				
				aux = countries.get(i);
				
				if(a1<b1) {
					countries.set(i, countries.get(j));
					countries.set(j, aux);
				} else if(a1==b1) {
					a2 = countries.get(i).getSilverTotal();
					b2 = countries.get(j).getSilverTotal();
						
					if(a2<b2) {
						countries.set(i, countries.get(j));
						countries.set(j, aux);
					} else if(a2==b2) {
						a3 = countries.get(i).getBronzeTotal();
						b3 = countries.get(j).getBronzeTotal();
			
						if(a3<b3) {
							countries.set(i, countries.get(j));
							countries.set(j, aux);
						} else if(a3==b3) {
							a4 = countries.get(i).getName();
							b4 = countries.get(j).getName();
							
							if(b4.compareTo(a4)>0) {
								countries.set(i, countries.get(j));
								countries.set(j, aux);
							}
						}		
					}	
				}
			}
		}
	}
	
	
	public String getText() {
		String text = "Masculino \n";
		
		sort1();
		
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldMan()+" "+c.getSilverMan()+" "+c.getBronzeMan();
		}
		
		sort2();
		
		text += "\n\n----------\n";
		text += "\nFemenino \n";
		
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldWoman()+" "+c.getSilverWoman()+" "+c.getBronzeWoman();
		}
		
		sort3();
		
		text += "\n\n----------\n";
		text += "\nCombinado \n";
		
		for(Country  c : countries) {
			text += "\n"+c.getName()+" "+c.getGoldTotal()+" "+c.getSilverTotal()+" "+c.getBronzeTotal();
		}
		return text;
	}
	
	
		
}
