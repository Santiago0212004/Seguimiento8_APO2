package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.Country;
import model.CountryData;


public class Main {
	
	static CountryData data = new CountryData();
	static String path = "src/text.txt";
	
	public static void main(String[] args) {

		try {
			readFile();
			System.out.println(data.getText());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFile() throws IOException { 
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<n; i++) {
			line = br.readLine();
			
			String[] countryText = line.split(";");
			
			String name = countryText[0];
			int goldMan = Integer.parseInt(countryText[1]);
			int silverMan = Integer.parseInt(countryText[2]);
			int bronzeMan = Integer.parseInt(countryText[3]);
			int goldWoman = Integer.parseInt(countryText[4]);
			int silverWoman = Integer.parseInt(countryText[5]);
			int bronzeWoman = Integer.parseInt(countryText[6]);
				
			data.countries.add(new Country(name, goldMan, silverMan, bronzeMan, goldWoman, silverWoman, bronzeWoman));	
		}
			
		if (br != null)br.close();
        if (fr != null)fr.close();

	}
}
