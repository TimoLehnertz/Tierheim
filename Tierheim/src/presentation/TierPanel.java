package presentation;

import javax.swing.JPanel;

import business.Tier;
import business.TierDatamanager;

public class TierPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	TierDatamanager tdm = new TierDatamanager();
	
	public TierPanel() {
		super();
		for (Tier tier : tdm.getAlleTiere()) {
			add(new DataLabel(tier));
		}
	}
}