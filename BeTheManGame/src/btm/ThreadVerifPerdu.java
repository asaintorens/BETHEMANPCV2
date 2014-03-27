package btm;

import java.util.Date;

import javax.swing.JFrame;

public class ThreadVerifPerdu extends Thread {
	 private static  boolean traitement;
	private Long tempsTouche;
	 private StartBeTheManGraphical frame;
	  public ThreadVerifPerdu(Long tempsTouche,StartBeTheManGraphical frame) {
		  this.traitement=true;
	    this.tempsTouche = tempsTouche;
	    this.frame = frame;
	  }
	  public void run() {
	   while (traitement){
		   Long tempsActuel = new Date().getTime();
		  // System.out.println("Temps touche : " + this.tempsTouche);
		  // System.out.println("Temps Actuel : " + tempsActuel);
		  
		  if (tempsActuel-tempsTouche>200)
		  {
			  this.frame.GameOver();
		  }
		  
		 
	  }
	}
	public Long getTempsTouche() {
		return tempsTouche;
	}
	public void setTempsTouche(Long tempsTouche) {
		this.tempsTouche = tempsTouche;
	}
	public  void kill() {
		traitement=false;
		
	}
}