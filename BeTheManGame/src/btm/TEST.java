package btm;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class TEST extends JPanel {

	/**
	 * Create the panel.
	 */
	public TEST() {
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setMaximum(200);
		progressBar.setValue(50);
		add(progressBar);

	}

}
