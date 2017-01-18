/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author p1505089
 */
public class Joueur {
    private String nom;
    private int points;
    public Joueur(String nom){
        this.nom=nom;
        points=0;
    }
    public String getNom(){
        return nom;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int points){
        this.points=points;
    }
}
