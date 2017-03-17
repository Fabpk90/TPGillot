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
    
    private float temps;
    private String nom;
    
    public Joueur(float temps, String nom)
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
    
    public void setTemps(float temps)
    {
        this.temps = temps;
    }
    
    public float getTemps()
    {
        return temps;
    }
}
