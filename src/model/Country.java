package model;

public class Country {
	private String name;
	private int goldMan;
	private int silverMan;
	private int bronzeMan;
	private int goldWoman;
	private int silverWoman;
	private int bronzeWoman;
	private int goldTotal;
	private int silverTotal;
	private int bronzeTotal;
	
	public Country(String name, int goldMen, int silverMan, int bronzeMan, int goldWoman, int silverWoman, int bronzeWoman) {
		this.name  = name;
		this.goldMan = goldMen;
		this.silverMan = silverMan;
		this.bronzeMan = bronzeMan;
		this.goldWoman = goldWoman;
		this.silverWoman = silverWoman;
		this.bronzeWoman = bronzeWoman;
		this.goldTotal = goldMen + goldWoman;
		this.silverTotal = silverMan + silverWoman;
		this.bronzeTotal = bronzeMan + bronzeWoman;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoldMan() {
		return goldMan;
	}

	public void setGoldMan(int goldMen) {
		this.goldMan = goldMen;
	}

	public int getSilverMan() {
		return silverMan;
	}

	public void setSilverMan(int silverMan) {
		this.silverMan = silverMan;
	}

	public int getBronzeMan() {
		return bronzeMan;
	}

	public void setBronzeMan(int bronzeMan) {
		this.bronzeMan = bronzeMan;
	}

	public int getGoldWoman() {
		return goldWoman;
	}

	public void setGoldWoman(int goldWoman) {
		this.goldWoman = goldWoman;
	}

	public int getSilverWoman() {
		return silverWoman;
	}

	public void setSilverWoman(int silverWoman) {
		this.silverWoman = silverWoman;
	}

	public int getBronzeWoman() {
		return bronzeWoman;
	}

	public void setBronzeWoman(int bronzeWoman) {
		this.bronzeWoman = bronzeWoman;
	}

	public int getGoldTotal() {
		return goldTotal;
	}

	public void setGoldTotal(int goldTotal) {
		this.goldTotal = goldTotal;
	}

	public int getSilverTotal() {
		return silverTotal;
	}

	public void setSilverTotal(int silverTotal) {
		this.silverTotal = silverTotal;
	}

	public int getBronzeTotal() {
		return bronzeTotal;
	}

	public void setBronzeTotal(int bronzeTotal) {
		this.bronzeTotal = bronzeTotal;
	}
	
	
	
	
}
