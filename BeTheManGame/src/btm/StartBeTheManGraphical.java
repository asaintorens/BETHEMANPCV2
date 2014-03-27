package btm;

import java.awt.EventQueue; 
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

public class StartBeTheManGraphical {

	private JFrame frame;
	private  Game BeTheMan;
	private ThreadVerifPerdu leThraed;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {


			public void run() {
				try 
				{
					//this.BeTheMan = new Game("Crymx");
					StartBeTheManGraphical window = new StartBeTheManGraphical();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartBeTheManGraphical() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		this.BeTheMan = new Game("CrymX");
		frame = new JFrame();
		leThraed = new ThreadVerifPerdu(null,this);		
		frame.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				BeTheMan.Touche();
				Long tempsActuel = new Date().getTime();
				leThraed.setTempsTouche(tempsActuel);
				if(e.getKeyCode()==e.VK_U)
				{
					System.out.println("START");
					BeTheMan = new Game("CrymX");
					BeTheMan.Touche();									
					leThraed.start();
					
				}
			}

		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public  void GameOver() {
		//
		leThraed.kill();
		System.out.println("GAME OVER");
		BeTheMan.GameOver();
		BeTheMan.RecapGame();
		System.exit(0);
	}



}
