package business;

import java.util.Arrays;
import java.util.List;

public class TierDatamanager {

	List<Tier> alleTiere = Arrays.asList(new Tier("Garfield"), new Tier("Wau"));;
	
	public List<Tier> getAlleTiere(){
		return alleTiere;
	}
}