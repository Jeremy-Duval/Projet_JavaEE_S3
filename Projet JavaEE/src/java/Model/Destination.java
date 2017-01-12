/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jérémy
 */
public class Destination {
    private final int threshold_valhalla = 100;//under : heaven
    private final int threshold_heaven = 75;//under : earth
    private final int threshold_earth = 50;//under : hell
    private final int threshold_hell = 25;// under : littlte poney
    
    public Destination(){
        
    }
    
    /**
     * Return the Valhalla's threshold
     * @return int
     * @author Jérémy
     */
    public int getValhalla(){
        return threshold_valhalla;
    }
    
    /**
     * Return the Heaven's threshold
     * @return int
     * @author Jérémy
     */
    public int getHeaven(){
        return threshold_heaven;
    }
    
    /**
     * Return the Earth's threshold
     * @return int
     * @author Jérémy
     */
    public int getEarth(){
        return threshold_earth;
    }
    
    /**
     * Return the Hell's threshold
     * @return int
     * @author Jérémy
     */
    public int getHell(){
        return threshold_hell;
    }
    
    /**
     * Return a String with the name of the destination.
     * @return String
     * @author Jérémy
     */
    public String getDestination(int point){
        String destination = null;
        
        if(point>=threshold_valhalla){
            destination = "au Valhalla ! Bienvenu parmis les élu(e)s";
        } else if (point>=threshold_heaven){
            destination = "au paradis !";
        } else if (point>=threshold_earth){
            destination = "errer sur Terre à jamais !";
        } else if (point>=threshold_hell){
            destination = "en enfert !";
        } else {
            destination = "jouer aux petits poneys pour l'éternité ! MWAHAHAHAHA !!!";
        }
        
        return destination;
    }
}
