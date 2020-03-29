package presentation;

import java.awt.Color;

import javax.swing.JLabel;

import business.Tier;

public class DataLabel extends JLabel {

	private static final long serialVersionUID = 1L;
	
	public DataLabel(Tier tier) {
		super();
		setText(tier.getName());
		setForeground(Color.red);
	}
}