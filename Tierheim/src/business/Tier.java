package business;

import java.util.Date;

public class Tier {

	String name;
	int alter;
	Date imTierheimSeit;
	
	public Tier(String name) {
		super();
		this.name = name;
		this.imTierheimSeit = new Date();
	}

	public String getName() {
		return name;
	}
}