package btm;

import java.util.Date;

public class ThreadVerifPerdu extends Thread {
	 private Long tempsTouche;
	 
	  public ThreadVerifPerdu(Long tempsTouche) {
	    this.tempsTouche = tempsTouche;
	  }
	  public void run() {
	   while (true){
		   Long tempsActuel = new Date().getTime();
		   System.out.println("Temps touche : " + this.tempsTouche);
		   System.out.println("Temps Actuel : " + tempsActuel);
		  if (tempsActuel-tempsTouche>3000)
		  {
			  
			 
			  
		  }
		  System.out.println("DANS THREAD");
		  try {
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
	  }
	}
	public Long getTempsTouche() {
		return tempsTouche;
	}
	public void setTempsTouche(Long tempsTouche) {
		this.tempsTouche = tempsTouche;
	}
}