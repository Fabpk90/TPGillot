/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgillot;

/**
 *
 * @author santor-f16
 */
public class Joueur {
    
    private int temps;
    private String nom;
    
    public Joueur(int temps, String nom)
    {
        this.temps = temps;
        this.nom = nom;
    }
    
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public String getNom()
    {
        return nom;
    }
    
    public void setTemps(int temps)
    {
        this.temps = temps;
    }
    
    public float getTemps()
    {
        return temps;
    }
    
    public void loseTime(float amount)
    {
        temps -= amount;
    }
    
    public boolean isDead()
    {
        return getTemps() <= 0;
    }
}
