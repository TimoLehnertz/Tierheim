package presentation;

import javax.swing.JFrame;

public class TierheimFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	TierPanel td = new TierPanel();
	
	public TierheimFrame() {
		super();
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(td);
	}
}