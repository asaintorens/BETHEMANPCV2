package btm;

import java.util.Date;

import javax.swing.JOptionPane;

public class Game {

	private int nombreTouche;
	

	private Long dateDebutDuJeux;
	private Long dateFinDuJeux;
	private Long tempsTouche;
	public Long getTempsTouche() {
		return tempsTouche;
	}


	private String pseudo;
	
	public Game(String pseudo) {
		this.nombreTouche=0;
		this.dateDebutDuJeux = new Date().getTime();
		this.pseudo=pseudo;
	}
	
	public void Touche()
	{
		this.nombreTouche++;
		this.tempsTouche = new Date().getTime();
	}
	
	public void GameOver()
	{
		this.dateFinDuJeux = new Date().getTime();
	}
	
	public String TempsDeJeu()
	{
		return this.dateFinDuJeux-this.dateDebutDuJeux+"";	 
	}
	
	public int getNombreTouche() {
		return nombreTouche;
	}
	
	
	public void RecapGame()
	{
		JOptionPane.showMessageDialog(null," nb touche = "+this.getNombreTouche() +"  temps de jeux : "+ this.TempsDeJeu());
		System.out.println("nb touche = "+this.getNombreTouche());
		System.out.println("temps de jeux : "+ this.TempsDeJeu());
	}

	public void SaveScore() {
		// TODO Auto-generated method stub
		
	}
}
